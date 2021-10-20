package servlet;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.COUNT;

import dao.PadroneDao;
import model.Padrone;


@Stateless
@Path("rest")
public class RestController {
	@Inject
	private PadroneDao padroneDao;
	
	
	//provare? non puo avere un costruttore pubblico
//	@Inject
//	public RestController (PadroneDao padroneDao){
//		this.padroneDao = padroneDao;
//	}

//
	@GET
	@Produces(MediaType.APPLICATION_JSON) //formato di dato
	@Path("{id}") //variabile {}
	public Padrone getById(@PathParam("id") int id) {
		return padroneDao.get(id);
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("insert")
	public void insertPadrone(Padrone nuovoPadrone) {
		padroneDao.save(nuovoPadrone);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("generaTrePadroni")
	public List<Padrone> generaPadrones(){
		AtomicInteger count = new AtomicInteger(1);
//		Padrone padrone1 = new Padrone();
//		Padrone padrone2 = new Padrone();
//		Padrone padrone3 = new Padrone();
		List<Padrone> padroniList = Arrays
				.asList(new Padrone(),
						new Padrone(),
						new Padrone());
		padroniList.stream()
			.forEach(persona -> {
					persona.setNome("nome"+count.get());
					persona.setCognome("cognome"+count.getAndIncrement());
					padroneDao.save(persona);
			});
		//terzo inserimento illegale test
		return padroniList;
	}
	

}

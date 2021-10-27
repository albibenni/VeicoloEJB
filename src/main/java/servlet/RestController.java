package servlet;

import dao.AutoDao;
import dao.AutobusDao;
import dao.MotoDao;
import dao.ParcheggioDao;
import model.Auto;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Stateless
@Path("rest")
public class RestController {
    @Inject
    private AutoDao autoDao;
    @Inject
    private MotoDao motoDao;
    @Inject
    private AutobusDao autobusDao;
    @Inject
    private ParcheggioDao parcheggioDao;
    //
    @GET
    @Produces(MediaType.APPLICATION_JSON) //formato di dato
    @Path("{id}") //variabile {}
    public Auto getById(@PathParam("id") int id) {
        return autoDao.get(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON) //formato di dato
    @Path("all") //variabile {}
    public List<Auto> getEveryone() {
        return autoDao.getAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("insert")
    public void insertAuto(Auto nuovaAuto) {
        autoDao.save(nuovaAuto);
    }


}

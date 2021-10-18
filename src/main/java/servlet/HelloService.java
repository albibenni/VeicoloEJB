package servlet;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class HelloService {

//	@Inject
//	PersonaDao personaDao;
	
	public String createHelloMessage(String name) {
		return "Hello " + name + "!";
	}

//	public void getAll() {
//		Persona p=personaDao.getById(1L);
//		System.out.println(p);
//	}

}

package servlet;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.CaneDao;
import dao.PadroneDao;
import model.Padrone;

@Stateless
public class HelloService {
	@Inject
	CaneDao caneDao;
	@Inject
	PadroneDao padroneDao;
	
	public String createHelloMessage(String name) {
		return "Hello " + name + "!";
	}

	public void getAll() {
		Padrone p= (Padrone) padroneDao.getAll(); //?
		System.out.println(p);
	}

}

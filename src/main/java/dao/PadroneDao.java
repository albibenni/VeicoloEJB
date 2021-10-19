package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Padrone;

@Stateless
public class PadroneDao { //farlo con interfaccia dao(crud)
	
	@PersistenceContext(unitName = "persistenceUnit1") // tipo 'inject'
	private EntityManager em;
	
	public Padrone getById(int padroneId) {
		return em.find(Padrone.class, padroneId);
	}
}

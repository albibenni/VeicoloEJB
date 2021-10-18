package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Padrone;

@Stateless
public class PadroneDao {
	
	@PersistenceContext(unitName = "persistenceUnit1")
	private EntityManager em;
	
	public Padrone getById(int padroneId) {
		return em.find(Padrone.class, padroneId);
	}
}

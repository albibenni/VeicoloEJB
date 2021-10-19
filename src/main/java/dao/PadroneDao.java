package dao;

import java.util.List;
import java.util.Optional;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Padrone;

@Stateless
public class PadroneDao implements Dao<Padrone> { //farlo con interfaccia dao(crud)
	
	@PersistenceContext(unitName = "persistenceUnit1") // tipo 'inject'
	private EntityManager em;
	
//	public Padrone getById(int padroneId) {
//		return em.find(Padrone.class, padroneId);
//	}

	@Override
	public Optional<Padrone> get(int id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(em.find(Padrone.class, id));
	}

	@Override
	public List<Padrone> getAll() {
		return em.createNamedQuery("findAllDogOwners", Padrone.class)
				.getResultList();
	}

	@Override
	public void save(Padrone t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Padrone t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Padrone t) {
		// TODO Auto-generated method stub
		
	}
}

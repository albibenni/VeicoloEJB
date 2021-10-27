package dao;

import model.Auto;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AutoDao {

    @PersistenceContext(unitName = "persistenceUnit1")
    private EntityManager em;

    public Auto get(int id) {
        return em.find(Auto.class, id);
    }

    public void save(Auto a) {
        em.persist(a);
    }

    public List<Auto> getAll(){
        return em.createNamedQuery("findAllCars", Auto.class)
                .getResultList();
    }
}

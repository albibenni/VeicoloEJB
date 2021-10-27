package dao;

import model.Moto;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class MotoDao {
    @PersistenceContext(unitName = "persistenceUnit1")
    private EntityManager em;

    public Moto getAutobus(int id){
        return em.find(Moto.class, id);
    }
}

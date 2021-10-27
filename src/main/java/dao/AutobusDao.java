package dao;


import model.Autobus;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AutobusDao {
    @PersistenceContext(unitName = "persistenceUnit1")
    private EntityManager em;

    public Autobus getAutobus(int id){
        return em.find(Autobus.class, id);
    }
}

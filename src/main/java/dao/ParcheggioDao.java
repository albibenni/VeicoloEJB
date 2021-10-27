package dao;

import model.Auto;
import model.Autobus;
import model.Moto;
import model.Parcheggio;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ParcheggioDao {

    @PersistenceContext(unitName = "persistenceUnit1")
    private EntityManager em;

    public Parcheggio getParcheggio(int id){
        return em.find(Parcheggio.class, id);
    }



}

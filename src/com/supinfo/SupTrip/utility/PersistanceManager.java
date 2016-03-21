package com.supinfo.SupTrip.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by alexa on 10/03/2016.
 */
public class PersistanceManager {
    private static EntityManagerFactory emf;
    // Lazy initialization
    public static EntityManagerFactory  getEntityManagerFactory(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("My-PU");
        }
        return emf;
    }

    // constructeur priv e de pr  enevement d'instanciation
    private PersistanceManager(){}

    public static void closeEntityManagerFactory(){
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
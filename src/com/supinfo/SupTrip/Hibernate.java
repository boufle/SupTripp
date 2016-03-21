package com.supinfo.SupTrip;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by Boufle on 21/03/2016.
 */
public class Hibernate {

    private Session session;

    private static Hibernate ourInstance = new Hibernate();

    public static Hibernate getInstance() {
        return ourInstance;
    }

    private Hibernate() {

        Configuration configuration = new Configuration().configure();

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        SessionFactory sessionFactory = configuration
                .buildSessionFactory(serviceRegistry);

        session = sessionFactory.openSession();
    }
}

package com.supinfo.SupTrip.servlet;

import com.supinfo.SupTrip.Hibernate;
import com.supinfo.SupTrip.entity.CampusEntity;
import com.supinfo.SupTrip.entity.UserEntity;
import com.supinfo.SupTrip.utility.PersistanceManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.infinispan.persistence.manager.PersistenceManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Boufle on 21/03/2016.
 */
@WebServlet(name = "Servlet", urlPatterns = "")

public class Servlet extends HttpServlet {

    EntityManagerFactory persistanceManager = PersistanceManager.getEntityManagerFactory();
    EntityManager entityManager = null;

    public static final String VUE          = "/login.jsp";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        entityManager = persistanceManager.createEntityManager();


        String type = request.getParameter("password");


        if (type != null){


            String idbooster = request.getParameter("idBooster");

            Query query = entityManager.createQuery("SELECT e FROM UserEntity e WHERE e.booster = :idbooster ").setParameter("idbooster", idbooster);
            List list = query.getResultList();
            System.out.println(list.toString());

            if (list.isEmpty()){

                UserEntity user = new UserEntity();
                user.setCampuName(request.getParameter("campusCity"));
                user.setEmailAdress(request.getParameter("email"));
                user.setFirstName(request.getParameter("firstName"));
                user.setLastName(request.getParameter("lastName"));
                user.setPassword(request.getParameter("password"));
                user.setBooster(request.getParameter("idBooster"));
                entityManager.getTransaction().begin();
                entityManager.persist(user);
                entityManager.getTransaction().commit();
                // this.getServletContext().getRequestDispatcher("index.jsp").forward(request,response);
            }
            else {

                PrintWriter out = response.getWriter();
                out.println("<html><head></head><body onload=\"alert('hello')\"></body></html>");
               /*
                response.setContentType("text/html");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('deadbeef');");
                out.println("</script>");*/
            }

        }
        else {

        }

        entityManager.close();
       // this.getServletContext().getRequestDispatcher(VUE).forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {





        this.getServletContext().getRequestDispatcher(VUE).forward(request,response);

    }


}

package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.time.LocalDate;

public class ClientDemo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Restaurant.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        insertRestaurant(sessionFactory);
        updateRestaurantById(sessionFactory, 101, "Paradise Biryani", "OPEN");

        sessionFactory.close();
    }

    private static void insertRestaurant(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Restaurant restaurant = new Restaurant(
                101,
                "Spice Garden",
                LocalDate.of(2026, 5, 2),
                "ACTIVE",
                "Hyderabad",
                4.5,
                "Rahul Sharma"
        );

        session.persist(restaurant);
        transaction.commit();
        session.close();

        System.out.println("Restaurant record inserted successfully.");
    }

    private static void updateRestaurantById(SessionFactory sessionFactory, int id, String newName, String newStatus) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "update Restaurant set name = :rname, status = :rstatus where id = :rid";
        Query<?> query = session.createQuery(hql);
        query.setParameter("rname", newName);
        query.setParameter("rstatus", newStatus);
        query.setParameter("rid", id);

        int rowsAffected = query.executeUpdate();
        transaction.commit();
        session.close();

        System.out.println("Number of records updated: " + rowsAffected);
    }
}

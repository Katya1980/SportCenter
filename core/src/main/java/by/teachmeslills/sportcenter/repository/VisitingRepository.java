package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.Customer;
import by.teachmeslills.sportcenter.entity.Room;
import by.teachmeslills.sportcenter.entity.Services;
import by.teachmeslills.sportcenter.entity.Visiting;
import by.teachmeslills.sportcenter.hibernate.HibernateJava;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;

public class VisitingRepository implements VisitingInterface{
    private final SessionFactory sessionFactory;

    public VisitingRepository() {
        sessionFactory = HibernateJava.getSessionFactory();
    }
    @Override
    public void addVisiting(Visiting visiting) {

        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(visiting);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateCustomVisiting(Long customerId, Long visitingId) {
        Session session = sessionFactory.openSession();
        Customer customer = session.load(Customer.class, customerId);
        Visiting visiting = session.load(Visiting.class, visitingId);
        visiting.setCustomer(customer);
        session.beginTransaction();
        session.merge(visiting);
        session.getTransaction().commit();
        session.close();
    }



}

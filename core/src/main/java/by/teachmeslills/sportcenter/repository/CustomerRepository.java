package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.Customer;
import by.teachmeslills.sportcenter.entity.Visiting;
import by.teachmeslills.sportcenter.hibernate.HibernateJava;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CustomerRepository implements CustomerInterface {

    private final SessionFactory sessionFactory;

    public CustomerRepository() {
        sessionFactory = HibernateJava.getSessionFactory();
    }

    @Override
    public void addCustomer(Customer customer) {

        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(customer);
        session.getTransaction().commit();
        session.close();

    }



}


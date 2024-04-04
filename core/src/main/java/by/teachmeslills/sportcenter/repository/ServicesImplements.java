package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.Services;
import by.teachmeslills.sportcenter.entity.User;
import by.teachmeslills.sportcenter.hibernate.HibernateConnection;
import by.teachmeslills.sportcenter.hibernate.HibernateJava;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;

import java.util.List;

public class ServicesImplements implements ServicesRepository{


    private final SessionFactory sessionFactory;

    public ServicesImplements() {
        sessionFactory = HibernateJava.getSessionFactory();
    }

    @Override
    public List<Services> getAll() {
        EntityManager entityManager = HibernateConnection.getEntityManager();
        //Выборка всех студентов из таблицы. Используется язык JPQL
        List<Services> services = entityManager.createQuery("select s from Services s").getResultList();
        entityManager.close();
        return services;
    }

    @Override
    public void addServices(Services services) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(services);
        session.getTransaction().commit();
        session.close();


    }
}

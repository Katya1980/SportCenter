package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.Worker;
import by.teachmeslills.sportcenter.hibernate.HibernateJava;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class WorkerRepository  implements WorkerInterface{

    private final SessionFactory sessionFactory;

    public WorkerRepository() {
        sessionFactory = HibernateJava.getSessionFactory();
    }

    @Override
    public void addWorker(Worker worker) {

        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(worker);
        session.getTransaction().commit();
        session.close();


    }
}

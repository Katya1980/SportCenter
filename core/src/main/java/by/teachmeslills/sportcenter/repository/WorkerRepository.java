package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.Worker;
import by.teachmeslills.sportcenter.hibernate.HibernateJava;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class WorkerRepository implements WorkerInterface {

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

    @Override
    public Worker maxSalaryWorker(Integer maxsalary) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select s from Worker s where s.salary in(:salary)");
        query.setMaxResults(maxsalary);
        List workerList = query.getResultList();
        Worker worker= (Worker) workerList.get(0);
        session.close();
        return worker;
    }




    @Override
    public void minSalaryWorker() {

    }
}

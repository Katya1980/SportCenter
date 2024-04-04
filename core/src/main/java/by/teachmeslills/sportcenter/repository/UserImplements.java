package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.User;
import by.teachmeslills.sportcenter.entity.UserStatus;
import by.teachmeslills.sportcenter.hibernate.HibernateConnection;
import by.teachmeslills.sportcenter.hibernate.HibernateJava;
import by.teachmeslills.sportcenter.servis.UserServise;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.List;

public class UserImplements implements UserRepository {

    private final SessionFactory sessionFactory;

    public UserImplements() {
        sessionFactory = HibernateJava.getSessionFactory();
    }


    @Override
    public List<User> getAll() {
        EntityManager entityManager = HibernateConnection.getEntityManager();
        //Выборка всех студентов из таблицы. Используется язык JPQL
        List<User> users = entityManager.createQuery("select s from User s").getResultList();
        entityManager.close();
        return users;
    }

    @Override
    public  User findById(Long id) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select s from User s");
        List<User> users = (List<User>) query.getResultList();
        session.getTransaction().begin();
        User user = session.load(User.class, id);
        session.find(User.class,id);
        session.getTransaction().commit();
        session.close();
        return user;




    }

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        //До сюда студент находится в состоянии Transient
        session.persist(user);

        session.getTransaction().commit();
        //После комита студент попал в бд и удалился Garbage collector
        session.close();

    }

    @Override
    public void deleteById(Long id) {
        Session session = sessionFactory.openSession();
        User user = session.load(User.class, id);
        session.beginTransaction();
        session.remove(user);
        session.getTransaction().commit();
        session.close();

//        session.beginTransaction();
//        User user= new User();
//        user.setId(id);
//        session.delete(user);
//        session.getTransaction().commit();

    }

    public void updateStatus(Long id, UserStatus userStatus) {
        Session session = sessionFactory.openSession();
//        //Метод load работает с прокси
        User user = session.load(User.class, id);
//        //Полученный студент находится в состоянии персистент
 //       user.setStatus(userStatus);
        session.beginTransaction();
        session.merge(user);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void updateLocalDate(Long id, LocalDate localDate) {
        Session session = sessionFactory.openSession();
        User user = session.load(User.class, id);
      //  user.setLocalDate(localDate);
        session.beginTransaction();
        session.merge(user);
        session.getTransaction().commit();
        session.close();


    }



}

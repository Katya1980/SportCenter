package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.Room;
import by.teachmeslills.sportcenter.entity.RoomStatus;
import by.teachmeslills.sportcenter.entity.User;
import by.teachmeslills.sportcenter.hibernate.HibernateJava;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;

public class RoomImplements implements RoomRepository {

    private final SessionFactory sessionFactory;

    public RoomImplements() {
        sessionFactory = HibernateJava.getSessionFactory();
    }

    @Override
    public void addRoom(Room room) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(room);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void updateStatus(Long id, RoomStatus roomStatus) {
        Session session = sessionFactory.openSession();
//        //Метод load работает с прокси
        Room room = session.load(Room.class, id);
        room.setStatus(roomStatus);
        session.beginTransaction();
        session.merge(room);
        session.getTransaction().commit();
        session.close();

    }
}

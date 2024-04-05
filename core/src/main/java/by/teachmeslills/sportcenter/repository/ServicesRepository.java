package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.Room;
import by.teachmeslills.sportcenter.entity.Services;
import org.hibernate.Session;

import java.util.List;

public interface ServicesRepository {

    List<Services> getAll();
    void addServices(Services services);

    void upDateServis (Services services);

    void updateRoomServices(Long serviceId, Long roomId);
}

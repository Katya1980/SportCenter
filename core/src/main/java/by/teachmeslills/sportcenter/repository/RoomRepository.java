package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.Room;
import by.teachmeslills.sportcenter.entity.RoomStatus;
import by.teachmeslills.sportcenter.entity.User;
import by.teachmeslills.sportcenter.entity.UserStatus;

public interface RoomRepository {

    void addRoom(Room  room);

    void updateStatus (Long id, RoomStatus roomStatus);
}

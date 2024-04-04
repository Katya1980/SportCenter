package by.teachmeslills.sportcenter.servis;

import by.teachmeslills.sportcenter.entity.Room;
import by.teachmeslills.sportcenter.entity.RoomStatus;

import by.teachmeslills.sportcenter.repository.RoomRepository;


public class RoomService {

    private final RoomRepository repository;

    public RoomService(RoomRepository  repository) {

        this.repository = repository;
    }
    public void add(Room  room) {

        repository.addRoom( room);
    }

    public void updateStatus (Long id, RoomStatus  roomStatus) {
        repository.updateStatus(id, roomStatus);
    }
}

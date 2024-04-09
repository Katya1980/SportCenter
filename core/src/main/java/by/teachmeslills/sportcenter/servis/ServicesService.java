package by.teachmeslills.sportcenter.servis;

import by.teachmeslills.sportcenter.entity.Services;

import by.teachmeslills.sportcenter.repository.ServicesRepository;


import java.util.List;

public class ServicesService {
    private final ServicesRepository repository;

    public ServicesService(ServicesRepository  repository) {

        this.repository = repository;
    }
    public void add(Services services) {

        repository.addServices(services);
    }

    public void updateRoomInService(Long servicesId, Long RoomId) {

         repository.updateRoomServices(servicesId, RoomId);
    }
    public List<Services> getServices() {

        return  repository.getAll();
    }






}

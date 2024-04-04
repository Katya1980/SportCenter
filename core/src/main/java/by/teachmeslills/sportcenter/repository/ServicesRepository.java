package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.Services;
import by.teachmeslills.sportcenter.entity.User;

import java.util.List;

public interface ServicesRepository {

    List<Services> getAll();
    void addServices(Services services);
}

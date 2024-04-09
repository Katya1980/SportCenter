package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.User;
import by.teachmeslills.sportcenter.entity.UserStatus;

import java.time.LocalDate;
import java.util.List;

public interface UserRepository {

    List<User> getAll();

    User findById(Long id);

    void addUser(User user);

    void deleteById(Long id);

    void updateStatus (Long id, UserStatus userStatus);



    void updateLocalDate(Long id, LocalDate localDate);

    User findByName(String name);
}



package by.teachmeslills.sportcenter.servis;


import by.teachmeslills.sportcenter.entity.User;
import by.teachmeslills.sportcenter.entity.UserStatus;
import by.teachmeslills.sportcenter.repository.UserRepository;

import java.time.LocalDate;
import java.util.List;


public class UserServise {
    private final UserRepository repository;

    public UserServise(UserRepository repository) {

        this.repository = repository;
    }

    public List<User> getUsers() {

         return  repository.getAll();
    }

    public User findById(long id) {

        return repository.findById(id);
    }

    public void add(User user) {

        repository.addUser(user);
    }


    public void deleteById(Long id) {

        repository.deleteById(id);
    }

public void updateStatus (Long id, UserStatus userStatus){
         repository.updateStatus(id, userStatus);
}
public void updateLocalDate(Long id, LocalDate localDate){
         repository.updateLocalDate(id,localDate);
}



}
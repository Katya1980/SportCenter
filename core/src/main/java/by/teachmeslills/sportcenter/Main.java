package by.teachmeslills.sportcenter;

import by.teachmeslills.sportcenter.entity.*;
import by.teachmeslills.sportcenter.repository.*;
import by.teachmeslills.sportcenter.servis.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {


    public static void main(String[] args) {
//        RoomService roomService = new RoomService(new RoomImplements());
//        Room room1 = new Room(null, "Зал № 1", 20, RoomStatus.ACTIVE, 20);
//        Room room2 = new Room(null, "Зал № 2", 20, RoomStatus.ACTIVE, 15);
//        Room room3 = new Room(null, "Баcсейн большой", 30, RoomStatus.REPAIR, 10);
//        Room room4 = new Room(null, "Баcсейн малый", 5, RoomStatus.ACTIVE, 15);
//        roomService.add(room1);
//        roomService.add(room2);
//        roomService.add(room3);
//        roomService.add(room4);

        ServicesService servicesService = new ServicesService(new ServicesImplements());
//        Services services1 = new Services(null,"Теннис", 100);
//        Services services2 = new Services(null,"Плавание", 120);
//        Services services3 = new Services(null,"Футбол", 150);
//        Services services4 = new Services(null,"Баскетбол", 90);
//        servicesService.add(services1);
//        servicesService.add(services2);
//        servicesService.add(services3);
//        servicesService.add(services4);

        servicesService.updateRoomInService(1L, 202l);


        UserServise userServise = new UserServise(new UserImplements());
        //       User user1 = new User(null, "Ваня", "Ванькин", "Минск, Сухаревсая", LocalDate.of(2000, 4,1));
//        User user2 = new User(null, "Петя", "Иванов", "Минск, Сухаревская", LocalDate.of(2000, 4,1));
//        User user3 = new User(null, "Саша", "Петров","Минск, Червякова", LocalDate.of(1999, 3,11));
//        User user4 = new User(null, "Женя", "Сидоров", "Минск,Короля", LocalDate.of(2000, 7,6));
//        User user5 = new User(null, "Коля", "Васильев",  "Минск, Тимирязева", LocalDate.of(2005, 12,26))
//        userServise.add(user1);
//        userServise.add(user2);
//        userServise.add(user3);
//        userServise.add(user4);
//        userServise.add(user5);

//        userServise.deleteById(52L);
//        userServise.deleteById(53L);
//        userServise.deleteById(54L);
//        userServise.deleteById(55L);
//        userServise.deleteById(56L);
//        userServise.deleteById(102L);

        // userServise.deleteById(106L);

        //userServise.updateStatus(2L,UserStatus.valueOf("BLOCK"));

        // userServise.updateLocalDate(3L, LocalDate.of(2024,04,01));

        userServise.findByUserName("Саша");

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String date = "16/08/1995";
//convert String to LocalDate
//        LocalDate localDate = LocalDate.parse(date, formatter);

        //     userById(userServise, 52L);


//        CustomerService customerService = new CustomerService(new CustomerRepository());
//
//        Customer customer3 = new Customer();
//        customer3.setId(null);
//        customer3.setName("Игорь");
//        customer3.setSurname("Козлов");
//        customer3.setAdress("Минск, Шаранговича, 3");
//        customer3.setStatus(UserStatus.ACTIV);
//        customer3.setAmountSpent(BigDecimal.valueOf(90));
//        customer3.setFirstDate(LocalDate.of(2023,11,10));
//        customer3.setLastDate(LocalDate.of(2024,1,30));
//        customer3.setBirthday(LocalDate.of(2002,6,17));
//        customerService.add(customer3);
//
//        WorkerService workerService = new WorkerService(new WorkerRepository());
//        Worker worker2 = new Worker();
//        worker2.setId(null);
//        worker2.setName("Саша");
//        worker2.setSurname("Сашкин");
//        worker2.setAdress("Минск, Чкалова, 45");
//        worker2.setBirthday(LocalDate.of(1995,12,4));
//        worker2.setPost("Электрик");
//        worker2.setDateOfEmployment(LocalDate.of(2023,2,1));
//        worker2.setSalary(2500);
//        worker2.setDismissal(LocalDate.of(2024,3,1));
//        workerService.add(worker2);




    }

    public static void userById(UserServise userServise, Long id) {

        System.out.println(userServise.findById(id));
    }



}
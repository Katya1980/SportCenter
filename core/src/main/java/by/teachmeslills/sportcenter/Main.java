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
      //  Services services5 = new Services(null, "Водное поло", 80);
     //   Services services6 = new Services(null, "Мини футбол", 110);
//        servicesService.add(services1);
//        servicesService.add(services2);
//        servicesService.add(services3);
//        servicesService.add(services4);
    //    servicesService.add(services5);
      //  servicesService.add(services6);

       // servicesService.updateRoomInService(52L, 205l);


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


        //  userFindName(userServise,"Саша");

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String date = "16/08/1995";
//convert String to LocalDate
//        LocalDate localDate = LocalDate.parse(date, formatter);

        //     userById(userServise, 52L);


   //    CustomerService customerService = new CustomerService(new CustomerRepository());
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
        WorkerService workerService = new WorkerService(new WorkerRepository());
//        Worker worker4 = new Worker();
//        worker4.setId(null);
//        worker4.setName("Наталья");
//        worker4.setSurname("Кукушкина");
//        worker4.setAdress("Минск, Беды, 20");
//        worker4.setBirthday(LocalDate.of(2001,8,20));
//        worker4.setPost("Главный бухгатер");
//        worker4.setDateOfEmployment(LocalDate.of(2022,1,20));
//        worker4.setSalary(3000);
//        worker2.setDismissal(LocalDate.of(2024,3,1));
//        workerService.add(worker4);

        VisitingService visitingService = new VisitingService(new VisitingRepository());
//        Visiting visiting2 = new Visiting(null,LocalDate.of(2024,1,15), BigDecimal.valueOf(15));
//        Visiting visiting3 = new Visiting(null,LocalDate.of(2024,1,16), BigDecimal.valueOf(20));
//        Visiting visiting4 = new Visiting(null,LocalDate.of(2024,1,20), BigDecimal.valueOf(10));
//        Visiting visiting5 = new Visiting(null,LocalDate.of(2024,1,21), BigDecimal.valueOf(5));
//        Visiting visiting6 = new Visiting(null,LocalDate.of(2024,1,26), BigDecimal.valueOf(15));
//        visitingService.add(visiting2);
//        visitingService.add(visiting3);
//        visitingService.add(visiting4);
//        visitingService.add(visiting5);
//        visitingService.add(visiting6);

//        visitingService.updateVisiting(52L,1L);
//        visitingService.updateVisiting(52L,2L);
//        visitingService.updateVisiting(102L,3L);
//        visitingService.updateVisiting(102L,4L);
//        visitingService.updateVisiting(102L,5L);


maxSalaryWorker(workerService,5000);

    }

    public static void userById(UserServise userServise, Long id) {

        System.out.println(userServise.findById(id));
    }

    public static void userFindName(UserServise userServise, String name) {

        System.out.println(userServise.findByUserName(name));
    }

    public static void maxSalaryWorker(WorkerService workerService, int salary){
        System.out.println(workerService.maxSalary(salary));
    }

}
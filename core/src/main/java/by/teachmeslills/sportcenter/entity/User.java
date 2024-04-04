package by.teachmeslills.sportcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(schema = "users_sch", name = "users")
@Inheritance (strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String adress;
    private LocalDate birthday;
   // private int age;
   // private String phoneNumber;
   // private LocalDate localDate;
  //  @Enumerated(EnumType.STRING)
   // private UserStatus status;
  //  private BigDecimal amountSpent;


    public User(Long id, String name, String surname, String adress, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.birthday = birthday;
    }

    public User() {

    }
}

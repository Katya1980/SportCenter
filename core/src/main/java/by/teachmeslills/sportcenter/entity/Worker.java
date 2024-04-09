package by.teachmeslills.sportcenter.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
//@AllArgsConstructor
@Table(schema = "users_sch", name = "worker")

public class Worker  extends User{
    @PrimaryKeyJoinColumn(name = "users_id")

    @Id
    @GeneratedValue
    private Long id;
    private String post;
    private int salary;
    private LocalDate dateOfEmployment;
    private LocalDate dismissal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public LocalDate getDismissal() {
        return dismissal;
    }

    public void setDismissal(LocalDate dismissal) {
        this.dismissal = dismissal;
    }
}

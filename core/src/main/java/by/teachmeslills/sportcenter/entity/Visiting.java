package by.teachmeslills.sportcenter.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor

@Table(schema = "users_sch", name = "visiting")

public class Visiting {


    @Id
    @GeneratedValue

    private Long id;
    private LocalDate dateOfVisit;
    private BigDecimal amountSpent;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Customer customer;





    public Visiting(Long id, LocalDate dateOfVisit, BigDecimal amountSpent) {
        this.id = id;
        this.dateOfVisit = dateOfVisit;
        this.amountSpent = amountSpent;
    }
}

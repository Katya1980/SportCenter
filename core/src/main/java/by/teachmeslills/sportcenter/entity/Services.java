package by.teachmeslills.sportcenter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema = "users_sch", name = "services_users")
public class Services {
    @Id
    @GeneratedValue

    private Long id;
    private String name;
    private int cost;

    public Services(Long id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}

package by.teachmeslills.sportcenter.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(schema = "users_sch", name = "services_users")
@NoArgsConstructor
public class Services {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int cost;

    @ManyToOne
    @JoinColumn(name = "room_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Room  room;

    public Services(Long id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }


}

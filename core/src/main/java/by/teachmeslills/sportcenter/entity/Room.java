package by.teachmeslills.sportcenter.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "users_sch", name = "rooms")

public class Room {

    @Id
    @GeneratedValue

    private Long id;
    private String name;
    private int maxPeople;
    @Enumerated(EnumType.STRING)
    private RoomStatus status;
    private int costhour;

    public Room(Long id, String name, int maxPeople, RoomStatus status, int costhour) {
        this.id = id;
        this.name = name;
        this.maxPeople = maxPeople;
        this.status = status;
        this.costhour = costhour;
    }
}

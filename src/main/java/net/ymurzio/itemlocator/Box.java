package net.ymurzio.itemlocator;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Box {

    protected Box() {}

    public Box(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Box[id=%d, name='%s']",
                box_id, name);
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long box_id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public Long getBox_id() {
        return box_id;
    }

    public void setBox_id(Long box_id) {
        this.box_id = box_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

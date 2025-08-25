package net.ymurzio.itemlocator;

import jakarta.persistence.*;

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
                boxId, name);
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long boxId;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public Long getBoxId() {
        return boxId;
    }

    public void setBoxId(Long boxId) {
        this.boxId = boxId;
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

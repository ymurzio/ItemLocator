package net.ymurzio.itemlocator;

import jakarta.persistence.*;

@Entity
public class Location {

    protected Location() {}

    public Location(String nearTo) {
        this.nearTo = nearTo;
    }

    @Override
    public String toString() {
        return String.format(
                "Location[id=%d, near_to='%s']",
                location_id, nearTo);
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long location_id;

    @Column(nullable = false)
    private String nearTo;

    public Long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Long location_id) {
        this.location_id = location_id;
    }

    public String getNearTo() {
        return nearTo;
    }

    public void setNearTo(String nearTo) {
        this.nearTo = nearTo;
    }
}

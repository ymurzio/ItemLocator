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
                locationId, nearTo);
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long locationId;

    @Column(nullable = false)
    private String nearTo;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getNearTo() {
        return nearTo;
    }

    public void setNearTo(String nearTo) {
        this.nearTo = nearTo;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

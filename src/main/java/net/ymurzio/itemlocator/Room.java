package net.ymurzio.itemlocator;

import jakarta.persistence.*;

@Entity
public class Room {

    protected Room() {}

    public Room(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return String.format(
                "Room[id=%d, name='%s']",
                room_id, roomName);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long room_id;

    @Column(nullable = false)
    private String roomName;

    public Long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Long room_id) {
        this.room_id = room_id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}

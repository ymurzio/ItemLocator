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
                roomId, roomName);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column(nullable = false)
    private String roomName;

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}

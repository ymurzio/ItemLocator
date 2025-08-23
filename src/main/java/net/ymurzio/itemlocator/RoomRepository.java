package net.ymurzio.itemlocator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "room", path = "room")
public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByRoomName(@Param("roomName") String roomName);
}

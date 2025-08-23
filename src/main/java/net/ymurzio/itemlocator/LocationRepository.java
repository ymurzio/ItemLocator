package net.ymurzio.itemlocator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "location", path = "location")
public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findByNearTo(@Param("nearTo") String nearTo);
}

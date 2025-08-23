package net.ymurzio.itemlocator;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "box", path = "box")
public interface BoxRepository extends JpaRepository<Box, Long> {
    List<Box> findByName(@Param("name") String name);
}

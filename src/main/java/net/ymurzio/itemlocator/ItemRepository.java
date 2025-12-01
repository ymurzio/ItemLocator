package net.ymurzio.itemlocator;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "item", path = "item")
public interface ItemRepository extends JpaRepository<Item, Long> {
    @Query("select i from Item i where i.name like %?1%")
    List<Item> findByName(@Param("name") String name);
}

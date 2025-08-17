package net.ymurzio.itemlocator;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "item", path = "item")
public interface ItemRepository extends PagingAndSortingRepository<Item, Long>, CrudRepository<Item,Long> {
    List<Item> findByName(@Param("name") String name);

}

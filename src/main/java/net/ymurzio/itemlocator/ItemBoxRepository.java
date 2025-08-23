package net.ymurzio.itemlocator;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "item", path = "item")
public interface ItemBoxRepository extends PagingAndSortingRepository<Item, Long>, CrudRepository<Item,Long> {
//    @Query("select i.name, box.name as box_name " +
//            "from item i " +
//            "join box b " +
//            "on (i.box_id = b.box_id)" +
//            "where i.name = :name")
//    List<Item> getItemsByName(@Param("name") String name);
    //List<Item> getItemsByName(String name);


}

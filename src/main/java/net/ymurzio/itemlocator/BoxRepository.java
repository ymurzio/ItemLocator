package net.ymurzio.itemlocator;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "box", path = "box")
public interface BoxRepository extends PagingAndSortingRepository<Box, Long>, CrudRepository<Box,Long> {
    List<Box> findByName(@Param("name") String name);
}

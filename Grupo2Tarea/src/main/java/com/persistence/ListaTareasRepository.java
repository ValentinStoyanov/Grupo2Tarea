package com.persistence;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.model.ListaTareas;

@Repository
public interface ListaTareasRepository extends MongoRepository<ListaTareas, String> {

}

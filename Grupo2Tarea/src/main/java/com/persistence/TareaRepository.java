package com.persistence;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.model.Tarea;

@Repository
public interface TareaRepository extends MongoRepository<Tarea, String> {

}

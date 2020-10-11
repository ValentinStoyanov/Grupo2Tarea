package com.persistence;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.model.Tarea;

@Repository
public interface TareaRepository extends MongoRepository<Tarea, String> {
	Optional<Tarea> findOneBy_id(String id);
}

package com.tnosql.v2.api.repository;

import com.tnosql.v2.api.model.Personas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonasRepository extends MongoRepository<Personas, String> {
}

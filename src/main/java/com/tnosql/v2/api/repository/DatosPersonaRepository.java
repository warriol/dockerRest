package com.tnosql.v2.api.repository;

import com.tnosql.v2.api.model.DatosPersona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosPersonaRepository extends MongoRepository<DatosPersona, String> {
}

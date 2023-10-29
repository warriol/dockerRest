package com.tnosql.v2.api.service;

import com.tnosql.v2.api.model.Direccion;
import com.tnosql.v2.api.repository.IDatosPersonaRepository;
import com.tnosql.v2.api.repository.IDireccionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DireccionService {
    @Autowired
    private MongoTemplate mongoTemplate;
    /**
     * inyeccion de dependencias
     */
    private final IDireccionRepository IDireccionRepository;
    /**
     * inyeccion de dependencias
     */
    private final IDatosPersonaRepository IDatosPersonaRepository;

    /**
     * metodo para obtener todas las direcciones
     */
    public boolean existeCi(String ci) {
        return IDatosPersonaRepository.existsById(ci);
    }

    /**
     * metodo para guardar una direccion, luego de comprobar que no existe en la base de datos
     * recibe como paremetros una ci y un objeto direccion
     */
    public boolean save(Direccion direccion) {
        if (existeCi(direccion.getCi())) {
            IDireccionRepository.save(direccion);
            return true;
        } else {
            return false;
        }
    }

    /**
     * lista direccion segun un parametro ci
     */
    public List<Direccion> findByCi(String ci) {
        return IDireccionRepository.findByCi(ci);
    }

    /**
     * lista de Direcciones segun un criterio
     * argumentos: departamento, localidad, barrio
     */
    public List<Direccion> findByDepartamentoAndLocalidadAndBarrio(String departamento, String localidad, String barrio) {
        Criteria criteria = new Criteria();

        if (departamento != null) {
            criteria = criteria.and("departamento").is(departamento);
        }
        if (localidad != null) {
            criteria = criteria.and("localidad").is(localidad);
        }
        if (barrio != null) {
            criteria = criteria.and("barrio").is(barrio);
        }

        Query query = new Query(criteria);
        return mongoTemplate.find(query, Direccion.class);
    }
}

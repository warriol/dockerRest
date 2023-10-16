package com.tnosql.v2.api.service;

import com.tnosql.v2.api.model.Personas;
import com.tnosql.v2.api.repository.PersonasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonasService {

    // creo una instancia de PersonasRepository
    private final PersonasRepository personasRepository;

    // metodo para gaurdar una persona
    public void save(Personas personas) {
        personasRepository.save(personas);
    }

    // metodo para obtener una lista de personas
    public List<Personas> findAll() {
        return personasRepository.findAll();
    }

    // metodo para obtener una persona por su id, usamos Optional para validar si existe o no
    public Optional<Personas> findById(String id) {
        return personasRepository.findById(id);
    }

    // metodo para eliminar una persona por su id
    public void deleteById(String id) {
        personasRepository.deleteById(id);
    }
}

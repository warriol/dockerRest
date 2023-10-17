package com.tnosql.v2.api.service;

import com.tnosql.v2.api.model.DatosPersona;
import com.tnosql.v2.api.repository.DatosPersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DatosPersonaService {

    /**
     * instancia de DatosPersonaRepository
     */
    private final DatosPersonaRepository datosPersonaRepository;

    /**
     * metodo para controlar que ci no existe en la base de datos
     */
    public boolean existeCi(String ci) {
        return datosPersonaRepository.existsById(ci);
    }

    /**
     * metodo para guardar una persona,
     * luego de comprobar que no existe en la base de datos
     */
    public void save(DatosPersona datosPersona) {
        if (!existeCi(datosPersona.getCi())) {
            datosPersonaRepository.save(datosPersona);
        }else {
            System.out.println("Error 401: Ya existe una persona con ese ci");
        }
    }

}

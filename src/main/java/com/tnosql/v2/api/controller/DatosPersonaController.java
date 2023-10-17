package com.tnosql.v2.api.controller;

import com.tnosql.v2.api.model.DatosPersona;
import com.tnosql.v2.api.service.DatosPersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DatosPersonaController {

    /**
     * instancia de DatosPersonaService
     */
    private final DatosPersonaService datosPersonaService;

    /**
     * recurso para guardar una persona
     */
    @PostMapping("/personas")
    public void save(@RequestBody DatosPersona datosPersona) {
        datosPersonaService.save(datosPersona);
    }

}

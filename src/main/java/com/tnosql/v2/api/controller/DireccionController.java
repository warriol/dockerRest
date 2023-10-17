package com.tnosql.v2.api.controller;

import com.tnosql.v2.api.model.Direccion;
import com.tnosql.v2.api.service.DireccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DireccionController {

    /**
     * instancia de DireccionService
     */
    private final DireccionService direccionService;

    @GetMapping("/direccion")
    public void save(@RequestBody Direccion direccion) {
        direccionService.save(direccion);
    }

    /**
     * recurso para obtener todas las direcciones de una persona
     */
    @GetMapping("/personas/{ci}")
    public List<Direccion> findByCi(@PathVariable String ci) {
        return direccionService.findByCi(ci);
    }

    /**
     * recurso para obtener domcilios segun criterios
     */
    @GetMapping("/direccion/{departamento}/{localidad}/{barrio}")
    public List<Direccion> findByDepartamentoOrLocalidadOrBarrio(@PathVariable String departamento, @PathVariable String localidad, @PathVariable String barrio) {
        return direccionService.findByDepartamentoOrLocalidadOrBarrio(departamento, localidad, barrio);
    }
}

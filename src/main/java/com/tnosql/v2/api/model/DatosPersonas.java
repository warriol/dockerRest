package com.tnosql.v2.api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "datosPersona")
@Data
public class DatosPersonas {

    @Indexed(unique = true)
    private String ci;

    private String nombre;
    private String apellido;
    private int edad;
}

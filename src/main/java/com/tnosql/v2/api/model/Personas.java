package com.tnosql.v2.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "personas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personas {

    @Id
    private String id;

    private DatosPersonas datosPersona;
    private Direcciones direccion;
}

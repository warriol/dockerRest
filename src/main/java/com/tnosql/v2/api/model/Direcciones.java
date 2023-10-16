package com.tnosql.v2.api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "direccion")
@Data
public class Direcciones {

    @Indexed
    private String Departamento;
    @Indexed
    private String Localidad;
    @Indexed
    private String Barrio;
    private String Calle;
    private int Nro;
    private String Apartamento;
    private String Padrón;
    private String Ruta;
    private int Km;
    private String Letra;
}

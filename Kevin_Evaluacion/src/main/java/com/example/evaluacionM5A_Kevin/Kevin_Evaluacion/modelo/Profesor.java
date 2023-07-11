/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.evaluacionM5A_Kevin.Kevin_Evaluacion.modelo;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author ASUS ROG
 */
@Document(collection="Profesor")
@Data
public class Profesor {
    @Id
    private Long Prof_Id;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private Depto depto;
    private List<Curso> listaCurso;
}

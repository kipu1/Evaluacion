/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.evaluacionM5A_Kevin.Kevin_Evaluacion.modelo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author ASUS ROG
 */
@Document(collection = "curso")
@Data
public class Curso {
    
    @Id
    private Long Curso_Id;
    private String Nombre;
    private String Nivel;
    private String Descripcion;
}


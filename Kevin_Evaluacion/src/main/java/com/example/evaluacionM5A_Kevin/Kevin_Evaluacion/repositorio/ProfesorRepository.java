/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.evaluacionM5A_Kevin.Kevin_Evaluacion.repositorio;


import com.example.evaluacionM5A_Kevin.Kevin_Evaluacion.modelo.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author ASUS ROG
 */
public interface ProfesorRepository extends MongoRepository<Profesor, Long>{
    
}


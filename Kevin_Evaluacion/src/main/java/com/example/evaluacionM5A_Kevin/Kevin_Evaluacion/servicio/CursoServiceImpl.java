/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.evaluacionM5A_Kevin.Kevin_Evaluacion.servicio;


import com.example.evaluacionM5A_Kevin.Kevin_Evaluacion.modelo.Curso;
import com.example.evaluacionM5A_Kevin.Kevin_Evaluacion.repositorio.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS ROG
 */
@Service
public class CursoServiceImpl  extends GenericServiceImpl<Curso, Long> implements GenericService<Curso, Long> {

    @Autowired
    CursoRepository cursoRepository;

    @Override
    public CrudRepository<Curso, Long> getDao() {
        return cursoRepository;
    }


    
}
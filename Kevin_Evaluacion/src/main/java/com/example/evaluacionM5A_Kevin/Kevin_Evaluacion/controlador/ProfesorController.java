/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.evaluacionM5A_Kevin.Kevin_Evaluacion.controlador;


import com.example.evaluacionM5A_Kevin.Kevin_Evaluacion.modelo.Profesor;
import com.example.evaluacionM5A_Kevin.Kevin_Evaluacion.servicio.ProfesorServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS ROG
 */
@RestController
@RequestMapping("/api/Profesor")
public class ProfesorController {
    @Autowired
    ProfesorServiceImpl profesorService;

    @GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listarProductos() {
        return new ResponseEntity<>(profesorService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Profesor> crearProducto(
            @RequestBody Profesor p) {
        return new ResponseEntity<>(profesorService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Profesor> actualizarProducto(@PathVariable Long id, @RequestBody Profesor p) {
        Profesor profesores = profesorService.findById(id);
        if (profesores == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                profesores.setNombre(p.getNombre());
                profesores.setDireccion(p.getDireccion());
                profesores.setTelefono(p.getTelefono());
                return new ResponseEntity<>(profesorService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Profesor> eliminarProducto(@PathVariable Long id) {
        profesorService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}


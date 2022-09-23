package com.Estudio.appMintic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Estudio.appMintic.entity.Empleado;
import com.Estudio.appMintic.repository.LibroRepository;



@Service
public class LibroServices {
    @Autowired
    private LibroRepository libroRepository;
    public List<EmpleadoRepository>obtenerTodoLibros(){
       return libroRepository.findAll();

    }
}

package com.Estudio.appMintic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Estudio.appMintic.entity.Empleado;
@Repository
public interface LibroRepository extends JpaRepository<EmpleadoRepository,Long>{
    
}

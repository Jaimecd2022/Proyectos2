package com.practica.granja.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="ANIMAL")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;  
    @ManyToOne
    @JoinColumn(name = "ESPECIE_ID")
    private Especie especie;
    @JoinColumn(name = "GRANJA_ID")
    private Granja granja;
    @Column
    private Date fechaNacimiento;
    @Column
    private String estadoSalud;
    @Column
    private String descripcion;
    @Column
    private Date ultimaVacuna;

    public Animal() {
    }

    public Animal(long id, Especie especie, Granja granja, Date fechaNacimiento, String estadoSalud, String descripcion,
            Date ultimaVacuna) {
        this.id = id;
        this.especie = especie;
        this.granja = granja;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoSalud = estadoSalud;
        this.descripcion = descripcion;
        this.ultimaVacuna = ultimaVacuna;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Granja getGranja() {
        return granja;
    }

    public void setGranja(Granja granja) {
        this.granja = granja;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getUltimaVacuna() {
        return ultimaVacuna;
    }

    public void setUltimaVacuna(Date ultimaVacuna) {
        this.ultimaVacuna = ultimaVacuna;
    }
    
    
    
}

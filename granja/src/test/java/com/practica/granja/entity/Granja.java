package com.practica.granja.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="GRANJA")
public class Granja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nombre;
    @Column    
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "administrador_id")
    private Persona administrador;

    @OneToMany(mappedBy = "granja")   
    private List<Animal>animales;
    @ManyToMany
    @JoinTable(name = "MAYORDOMO",joinColumns = {@JoinColumn(name="GRANJA_ID")},
        inverseJoinColumns ={@JoinColumn(name="PERSONA_ID")})
    
    private List<Persona>mayordomos;
    

    public Granja() {
    }

    public Granja(long id, String nombre, String direccion, Persona administrador, List<Persona> mayordomos,
            List<Animal> animales) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.administrador = administrador;
        this.mayordomos = mayordomos;
        this.animales = animales;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Persona administrador) {
        this.administrador = administrador;
    }

    public List<Persona> getMayordomos() {
        return mayordomos;
    }

    public void setMayordomos(List<Persona> mayordomos) {
        this.mayordomos = mayordomos;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    
    


    
}

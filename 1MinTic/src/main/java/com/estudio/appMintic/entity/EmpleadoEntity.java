package 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String email;
    @Column
    private String profile;
    @Column
    private int role;
    @Column
    private int numPaginas;
    @Column
    private double calificacion;
    @Column 
    @Enumerated(value = EnumType.STRING)
    private EnumRoleName rol;
    
    @ManyToOne
    @JoinColumn (name = "empresa_id")
    private EmpresaEntity empresa_id;


   



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public EnumRoleName getRol() {
        return rol;
    }

    public void setRol(EnumRoleName rol) {
        this.rol = rol;
    }

    public Transaction getAutor() {
        return autor;
    }

    public void setAutor(Transaction autor) {
        this.autor = autor;
    }

    

    

    
    

}

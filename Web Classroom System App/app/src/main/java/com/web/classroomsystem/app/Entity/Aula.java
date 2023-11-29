package com.web.classroomsystem.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="aulas")
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre_aula",nullable = false,length = 10)
    private String nombre_aula;

    @Column(name = "sede",nullable = false,length = 10)
    private String sede;

    @Column(name = "carrera",nullable = false,length = 50)
    private String carrera;

    @Column(name = "profesor",nullable = false,length = 20)
    private String profesor;

    @Column(name = "clase",nullable = false,length = 50)
    private String clase;

    @Column(name = "fecha",nullable = false,length = 15)
    private String fecha;

    @Column(name = "hora_inicio",nullable = false,length = 15)
    private String hora_inicio;

    @Column(name = "hora_fin",nullable = false,length = 15)
    private String hora_fin;

    public Aula() {

    }

    public Aula(long id, String nombre_aula, String sede, String carrera, String profesor, String clase, String fecha, String hora_inicio, String hora_fin) {
        this.id = id;
        this.nombre_aula = nombre_aula;
        this.sede = sede;
        this.carrera = carrera;
        this.profesor = profesor;
        this.clase = clase;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public Aula(String nombre_aula, String sede, String carrera, String profesor, String clase, String fecha, String hora_inicio, String hora_fin) {
        this.nombre_aula = nombre_aula;
        this.sede = sede;
        this.carrera = carrera;
        this.profesor = profesor;
        this.clase = clase;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre_aula() {
        return nombre_aula;
    }

    public void setNombre_aula(String nombre_aula) {
        this.nombre_aula = nombre_aula;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", nombre_aula='" + nombre_aula + '\'' +
                ", sede='" + sede + '\'' +
                ", carrera='" + carrera + '\'' +
                ", profesor='" + profesor + '\'' +
                ", clase='" + clase + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora_inicio='" + hora_inicio + '\'' +
                ", hora_fin='" + hora_fin + '\'' +
                '}';
    }
}

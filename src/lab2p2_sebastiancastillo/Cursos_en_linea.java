/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Cursos_en_linea {

    private String titulo;
    private String instructor;
    private String duracion;
    private String plataforma;

    public Cursos_en_linea(String titulo, String instrucor, String duracion, String plataforma) {
        this.titulo=titulo;
        this.instructor=instructor;
        this.duracion=duracion;
        this.plataforma=plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return  "Titulo: " + titulo + ", Instructor: " + instructor + ", Duracion: " + duracion + ", Plataforma: " + plataforma ;
    }
    
}

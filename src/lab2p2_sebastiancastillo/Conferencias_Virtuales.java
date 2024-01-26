/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_sebastiancastillo;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Conferencias_Virtuales {
    private String titulo;
    private String conferencista;
    private String fecha;
    private String duracion;
    private String enlace;
    
    public Conferencias_Virtuales (String titulo,String c,String fecha,String duracion,String enlace){
        this.titulo=titulo;
        conferencista=c;
        this.fecha=fecha;
        this.duracion=duracion;
        this.enlace=enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConferencista() {
        return conferencista;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Conferencista: " + conferencista + ", Fecha: " + fecha + ", Duracion: " + duracion + ", Enlace: " + enlace + '}';
    }
    
}

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
public class Articulos {
    private String titulo;
    private String autor;
    private String tema;
    private String fecha;
    private String acceso;
    
    public Articulos(String titulo,String autor,String tema,String fecha,String a){
        this.titulo=titulo;
        this.autor=autor;
        this.tema=tema;
        this.fecha=fecha;
        acceso=a;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String isAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return  "Titulo: " + titulo + ", Autor: " + autor + ", Tema: " + tema + ", Fecha: " + fecha + ", Acceso: " + acceso;
    }
    
}

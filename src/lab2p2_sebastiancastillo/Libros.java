/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Libros {
    private String titulo;
    private String autor;
    private String genero;
    private int ano;
    private boolean disponibilidad;
    
    public Libros(String titulo, String autor, String genero, int a,boolean d){
        this.titulo=titulo;
        this.autor=autor;
        this.genero=genero;
        ano=a;
        disponibilidad=d;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return  "Titulo: " + titulo + ", Autor: " + autor + ", Genero: " + genero + ", Año: " + ano + ", Disponibilidad: " + disponibilidad ;
    }
    
    
}

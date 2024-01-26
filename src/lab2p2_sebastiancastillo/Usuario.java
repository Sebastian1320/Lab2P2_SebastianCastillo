/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Usuario {
    private String nombre;
    private String contra;
    private String tipo;
    
    public Usuario(String nombre,String contra,String tipo){
        this.nombre=nombre;
        this.contra=contra;
        this.tipo=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContra() {
        return contra;
    }
    
}

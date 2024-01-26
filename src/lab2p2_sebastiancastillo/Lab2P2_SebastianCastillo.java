/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_sebastiancastillo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Lab2P2_SebastianCastillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("***** M E N U *****");
        System.out.println("1. Listar");
        System.out.println("2. Agregar");
        System.out.println("3. Modificar");
        System.out.println("4. Eliminar");
        System.out.println("5. Para salir");
        int op = leer.nextInt();
        while (op != 5) {
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Eliga una opcion valida");
                    break;
            }
            System.out.println("***** M E N U *****");
            System.out.println("1. Listar");
            System.out.println("2. Agregar");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar");
            System.out.println("5. Para salir");
            op = leer.nextInt();
        }

    }

}

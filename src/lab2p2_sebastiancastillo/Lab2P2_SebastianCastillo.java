/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_sebastiancastillo;

import java.util.ArrayList;
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
        ArrayList biblioteca = new ArrayList();
        while (op != 5) {
            switch (op) {
                case 1:
                    System.out.println("Libros");
                    int n=0;
                    for (Object t : biblioteca) {
                        if (biblioteca.get((int) t) instanceof Libros) {
                            System.out.println(n+". "+((Libros)biblioteca.get((int)t)).toString());
                            n++;
                        }
                    }
                    System.out.println("Articulos");
                    n=0;
                    for (Object t : biblioteca) {
                        if (biblioteca.get((int) t) instanceof Articulos) {
                            System.out.println(n+". "+((Articulos)biblioteca.get((int)t)).toString());
                            n++;
                        }
                    }
                    System.out.println("Cursos");
                    n=0;
                    for (Object t : biblioteca) {
                        if (biblioteca.get((int) t) instanceof Cursos_en_linea) {
                            System.out.println(n+". "+((Cursos_en_linea)biblioteca.get((int)t)).toString());
                            n++;
                        }
                    }
                    System.out.println("Conferencias");
                    n=0;
                    for (Object t : biblioteca) {
                        if (biblioteca.get((int) t) instanceof Conferencias_Virtuales) {
                            System.out.println(n+". "+((Conferencias_Virtuales)biblioteca.get((int)t)).toString());
                            n++;
                        }
                    }
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

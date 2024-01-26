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
        Usuario estudiante = new Usuario("Pepe", "pepelobogod", "Estudiante");
        Usuario Maestro = new Usuario("Osman", "OsmanelInge", "Maestro");
        Usuario Bibliotecario = new Usuario("Rodolfo", "Santa", "Bibliotecario");
        int nivel = 0;
        while (op != 5) {
            System.out.println("Ingrese el usuario");
            String user = leer.next();
            System.out.println("Ingrese la contraseña");
            String contra = leer.next();
            if (user.equals(estudiante.getNombre()) && contra.equals(estudiante.getContra())) {
                nivel = 1;
            } else if (user.equals(Maestro.getNombre()) && contra.equals(Maestro.getContra())) {
                nivel = 2;
            } else if (user.equals(Bibliotecario.getNombre()) && contra.equals(Bibliotecario.getContra())) {
                nivel = 3;
            } else {
                System.out.println("Datos ingresados no validos");
            }
            switch (op) {
                case 1:
                    if (nivel >= 1) {
                        System.out.println("Libros");
                        int n = 0;
                        for (Object t : biblioteca) {
                            System.out.println(biblioteca.indexOf(t) + ". " + t);
                        }
                    }
                    break;
                case 2:
                    if (nivel > 1) {
                        System.out.println("Cual es el tipo que usted quiere agregar");
                        System.out.println("1. Libros");
                        System.out.println("2. Articulos");
                        System.out.println("3. Cursos en línea");
                        System.out.println("4. Conferencias Virtuales");
                        int op2 = leer.nextInt();
                        if (op2 == 1) {
                            System.out.println("Ingresa el titulo");
                            leer.nextLine();
                            String titulo = leer.nextLine();
                            System.out.println("Ingresa un autor");
                            String autor = leer.nextLine();
                            System.out.println("Ingrese un genero");
                            String genero = leer.next();
                            System.out.println("Ingrese el año");
                            String ano = leer.next();
                            System.out.println("Esta disponble [si/no]");
                            String disp = leer.next();
                            if (disp.equals("si") || disp.equals("Si")) {
                                biblioteca.add(new Libros(titulo, autor, genero, ano, disp));
                            } else if (disp.equals("no") || disp.equals("No")) {
                                biblioteca.add(new Libros(titulo, autor, genero, ano, disp));
                            } else {
                                System.out.println("Opcion no valida");
                                System.out.println("Expulsando del programa");
                                break;
                            }
                        } else if (op == 2) {
                            System.out.println("Ingresa el titulo");
                            leer.nextLine();
                            String titulo = leer.nextLine();
                            System.out.println("Ingresa un tema");
                            String autor = leer.nextLine();
                            System.out.println("Ingrese un tema");
                            String tema = leer.next();
                            System.out.println("Ingrese Fecha de publicacion");
                            String fecha = leer.next();
                            System.out.println("Acceso en linea[si/no]");
                            String disp = leer.next();
                            if (disp.equals("si") || disp.equals("Si")) {
                                biblioteca.add(new Articulos(titulo, autor, tema, fecha, disp));
                            } else if (disp.equals("no") || disp.equals("No")) {
                                biblioteca.add(new Articulos(titulo, autor, tema, fecha, disp));
                            } else {
                                System.out.println("Opcion no valida");
                                System.out.println("Expulsando del programa");
                                break;
                            }
                        } else if (op == 3) {
                            System.out.println("Ingresa el titulo");
                            leer.nextLine();
                            String titulo = leer.nextLine();
                            System.out.println("Ingresa un instructor");
                            String instructor = leer.nextLine();
                            System.out.println("Ingrese Duracion en semanas");
                            String duracion = leer.next();
                            System.out.println("Ingrese plataforma de enseñanza");
                            String plat = leer.next();
                            biblioteca.add(new Cursos_en_linea(titulo, instructor, duracion, plat));
                        } else if (op == 4) {
                            System.out.println("Ingresa el titulo");
                            leer.nextLine();
                            String titulo = leer.nextLine();
                            System.out.println("Ingresa un conferencista");
                            String conferencista = leer.nextLine();
                            System.out.println("Ingrese una fecha");
                            String fecha = leer.next();
                            System.out.println("Ingrese la duracion");
                            String duracion = leer.next();
                            System.out.println("Ingrese el enlace de acceso");
                            String enlace = leer.next();
                            biblioteca.add(new Conferencias_Virtuales(titulo, conferencista, fecha, duracion, enlace));
                        } else {
                            while (op < 1 || op > 4) {
                                System.out.println("Ingrese una opcion valida");
                                System.out.println("Cual es el tipo que usted quiere agregar");
                                System.out.println("1. Libros");
                                System.out.println("2. Articulos");
                                System.out.println("3. Cursos en línea");
                                System.out.println("4. Conferencias Virtuales");
                                op2 = leer.nextInt();
                            }
                        }
                    } else {
                        System.out.println("No puede ingesar a esta opcion");
                    }
                    break;
                case 3:
                    if (nivel == 3) {
                        System.out.println("Ingrese la posicion de lo que quiera eliminar");
                        int ind = leer.nextInt();
                        if (ind <= biblioteca.size()) {
                            biblioteca.remove(ind);
                        } else {
                            System.out.println("Posicion no valida");
                        }
                    } else {
                        System.out.println("No puede ingresar a esta opcion");
                    }
                    break;
                case 4:
                    if (nivel == 3) {
                        System.out.println("Ingrese la posicion de lo que quiere modificar");
                        int ind = leer.nextInt();
                        if (ind <= biblioteca.size()) {
                            if(biblioteca.get(ind)instanceof Libros){
                                  System.out.println("Ingresa el titulo");
                            leer.nextLine();
                            String titulo = leer.nextLine();
                            System.out.println("Ingresa un autor");
                            String autor = leer.nextLine();
                            System.out.println("Ingrese un genero");
                            String genero = leer.next();
                            System.out.println("Ingrese el año");
                            String ano = leer.next();
                            System.out.println("Esta disponble [si/no]");
                            String disp = leer.next();
                            if (disp.equals("si") || disp.equals("Si")) {
                                biblioteca.set(ind,new Libros(titulo, autor, genero, ano, disp));
                            } else if (disp.equals("no") || disp.equals("No")) {
                                biblioteca.set(ind,new Libros(titulo, autor, genero, ano, disp));
                            } else {
                                System.out.println("Opcion no valida");
                                System.out.println("Expulsando del programa");
                                break;
                            }
                            }
                            
                        } else {
                            System.out.println("Posicion no valida");
                        }
                    } else {
                        System.out.println("No puede ingresar");
                    }
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

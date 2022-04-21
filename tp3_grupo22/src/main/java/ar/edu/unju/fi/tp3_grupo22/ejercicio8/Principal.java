package ar.edu.unju.fi.tp3_grupo22.ejercicio8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.tp3_grupo22.ejercicio3.Alumno;

public class Principal {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<Alumno>();
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        String resp = "s";

        int lu = 0;
        String dato = "";

        // menú de opcciones------
        while (op != 6) {
            System.out.println("------Menú de opciones------");
            System.out.println("1.- Nuevo Alumno.");
            System.out.println("2.- Eliminar Alumno.");
            System.out.println("3.- Modificar notas Alumno.");
            System.out.println("4.- Mostrar Alumno.");
            System.out.println("5.- Mostar los que superan el promedio de 6.");
            System.out.println("6.- Salir.");

            try {
                System.out.print("Ingrese opción:");
                op = entrada.nextInt();
                switch (op) {
                    case 1:
                        resp = "s";
                        while (!resp.equalsIgnoreCase("n")) {
                            double[] notas = new double[5];
                            Alumno alumno = new Alumno();
                            System.out.println("------ Datos del Alumno -------");
                            System.out.print("Apellido:");
                            alumno.setApellido(entrada.next());
                            System.out.print("Nombres:");
                            alumno.setNombres(entrada.next());
                            while (true) {
                                try {
                                    System.out.print("LU:");
                                    alumno.setLu(entrada.nextInt());
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("LU no valida intente de nuevo");
                                    entrada.next();
                                }
                            }

                            System.out.println("----- Ingrese Notas -----");
                            for (int i = 0; i < notas.length; i++) {
                                try {
                                    System.out.print("Nota " + String.valueOf(i + 1) + ":");
                                    notas[i] = entrada.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.println("Nota no valida ingrese de nuevo.");
                                    i--;
                                    entrada.next();
                                }
                            }
                            alumno.setNotas(notas);
                            alumnos.add(alumno);
                            System.out.print("Desea Ingresar otro alumno: S/N ");
                            resp = entrada.next();
                        }
                        System.out.println("Presione una tecla para Volver al menú principal");
                        entrada.next();
                        break;
                    case 2:

                        System.out.println("--- Eliminar alumno -----");
                        while (true) {
                            try {
                                System.out.print("Ingrese LU:");
                                lu = entrada.nextInt();
                                for (Alumno alumno : alumnos) {
                                    if (alumno.getLu() == lu) {
                                        dato = alumno.getApellido() + " " + alumno.getNombres();
                                        alumnos.remove(alumno);
                                        System.out.println("Alumno: " + dato + " eliminado");
                                    }
                                }
                                if (dato.length() == 0) {
                                    System.out.println("LU inexistente");
                                }
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("LU no valida!!");
                                entrada.next();
                            }
                        }
                        System.out.println("Presione cualquier tecla para Volver al menú principal");
                        entrada.next();
                        break;
                    case 3:
                        String respuesta = "s";
                        int k = 0;
                        System.out.println("--- Modificar notas -----");
                        while (true) {
                            try {
                                System.out.print("Ingrese LU: ");
                                lu = entrada.nextInt();
                                for (Alumno alumno : alumnos) {
                                    if (alumno.getLu() == lu) {
                                        while (!respuesta.equalsIgnoreCase("n")) {
                                            System.out.println("----Notas----");
                                            String notas = "";
                                            for (int j = 0; j < alumno.getNotas().length; j++) {
                                                notas += "Nota [" + j + "]:" + alumno.getNotas()[j] + " ";
                                            }
                                            System.out.println(notas);
                                            System.out.print("Elija la posición de la  nota a modificar:");
                                            k = entrada.nextInt();
                                            if (k < alumno.getNotas().length) {
                                                System.out.print("Ingrese nota: ");
                                                alumno.getNotas()[k] = entrada.nextDouble();
                                                System.out.print("Desea modificar otra nota? s/n ");
                                                respuesta = entrada.next();
                                            } else {
                                                System.out.println("Inexistente");
                                            }
                                        }
                                        break;
                                    }
                                }

                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("LU no valida!!");
                                entrada.next();
                            }

                        }
                        System.out.println("Presione cualquier tecla para Volver al menú principal");
                        entrada.next();
                        break;
                    case 4:
                        System.out.println("------Listado de alumnos -------");
                        for (Alumno alumno : alumnos) {
                            System.out.println("-------------------------------------------------------------------");
                            System.out.println("Apellido y Nombres:" + alumno.getApellido() + ", " + alumno.getNombres()
                                    + "        LU:" + alumno.getLu());
                        }
                        System.out.println("Volver al menú principal");
                        entrada.next();
                        break;
                    case 5:
                        System.out.println("--------- Alumnos que superan el promedio de 6");
                        for (Alumno alumno : alumnos) {
                            if (alumno.promedio() >= 6) {
                                System.out
                                        .println("-------------------------------------------------------------------");
                                System.out.println("Apellido y Nombres:" + alumno.getApellido() + ", "
                                        + alumno.getNombres() + "        LU:" + alumno.getLu());
                            }
                        }
                        System.out.println("Presione cualqier tecla para Volver al menú principal");
                        entrada.next();
                        // System.out.print("\033[H\033[2J");
                        // System.out.flush();

                        break;

                }

            } catch (InputMismatchException e) {
                System.out.println("Opción No Valida");
                entrada.next();
            }

        }
        entrada.close();

    }
}

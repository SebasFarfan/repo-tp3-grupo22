package ar.edu.unju.fi.tp3_grupo22.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
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
                System.out.print("Nota " + String.valueOf(i+1) + ":");
                notas[i] = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Nota no valida ingrese de nuevo.");
                i--;
                entrada.next();
            }
        }
        alumno.setNotas(notas);

        entrada.close();
        System.out.println("Promedio:"+alumno.promedio());
        System.out.println("Nota máxima:"+alumno.notaMaxima());


    }
}

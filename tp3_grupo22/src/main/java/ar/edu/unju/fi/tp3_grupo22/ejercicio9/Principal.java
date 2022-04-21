package ar.edu.unju.fi.tp3_grupo22.ejercicio9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int op = 0;
        String resp = "s";
        Scanner entrada = new Scanner(System.in);
        List<Producto> productos = new ArrayList<Producto>();

        // menú de opciones
        while (op != 5) {
            System.out.println("------Menú de opciones------");
            System.out.println("1.- Nuevo Producto.");
            System.out.println("2.- Mostrar todos los producto.");
            System.out.println("3.- Incrementar precio a todos los productos");
            System.out.println("4.- Monto total de todos los productos");
            System.out.println("5.- Salir.");

            try {
                System.out.print("Ingrese opción:");
                op = entrada.nextInt();
                switch (op) {
                    case 1:
                        resp = "s";
                        int codigo = 0;
                        String desc = "";
                        String marca = "";
                        double precio = 0;
                        while (!resp.equalsIgnoreCase("n")) {
                            System.out.println("----- Nuevo Producto ------");
                            while (true) {
                                try {
                                    System.out.print("Ingrese codigo:");
                                    codigo = entrada.nextInt();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Codigo NO valido");
                                    entrada.next();
                                }
                            }
                            System.out.print("Ingrese Descripción:");
                            desc = entrada.next();
                            while (true) {
                                try {
                                    System.out.print("Ingrese precio:");
                                    precio = entrada.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Precio NO valido");
                                    entrada.next();
                                }
                            }
                            System.out.print("Ingrese marca:");
                            marca = entrada.next();
                            Producto producto = new Producto(codigo, desc, precio, marca);
                            productos.add(producto);

                            System.out.print("Desea ingresar otro producto? S/N ");
                            resp = entrada.next();

                        }
                        System.out.println("Presione cualquier tecla para volver al menú principal");
                        entrada.next();
                        break;

                    case 2:
                        System.out.println("------- Listado de productos ---------");
                        System.out.println("Codigo      Descripcion             marca      precio");
                        for (Producto producto : productos) {
                            System.out.println("-------------------------------------------------");
                            System.out.println(producto.getCodigo() + "     " + producto.getDescripcion()
                                    + "             " + producto.getMarca() + "      " + producto.getPrecio());
                        }
                        System.out.println("Presione cualquier tecla para volver al menú principal");
                        entrada.next();
                        break;
                    case 3:
                        System.out.println("--- Incrementar precio a todos los productos -----");
                        System.out.println("Incremento en $100,25");
                        for (Producto producto : productos) {
                            producto.setPrecio(producto.getPrecio() + 100.25);
                        }
                        System.out.println("Presione cualquier tecla para volver al menú principal");
                        entrada.next();
                        break;
                    case 4:
                        double total = 0;
                        System.out.println("Codigo      Descripcion             marca      precio");
                        for (Producto producto : productos) {
                            System.out.println("-------------------------------------------------");
                            System.out.println(producto.getCodigo() + "     " + producto.getDescripcion()
                                    + "             " + producto.getMarca() + "      " + producto.getPrecio());
                            total+=producto.getPrecio();
                            System.out.println("TOTAL: $"+total);
                        }
                        System.out.println("Presione cualquier tecla para volver al menú principal");
                        entrada.next();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción Invalida !!");
                entrada.next();
            }
        }
        entrada.close();

    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author steve
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String empleado;
        int tipo;
        int aniosServicio;
        int porcentaje;
        double sueldoInicial;
        double incremento;
        double bonificacion;
        double nuevoSueldo;

        System.out.println("INCREMENTO SALARIAL");

        System.out.print("Ingrese el nombre del empleado: ");
        empleado = entrada.nextLine();

        System.out.print("Ingrese el tipo de empleado: ");
        tipo = entrada.nextInt();

        System.out.print("Ingrese los años de servicio: ");
        aniosServicio = entrada.nextInt();

        System.out.print("Ingrese el sueldo inicial: ");
        sueldoInicial = entrada.nextDouble();

        if (tipo == 1) {
            porcentaje = 5;
        } else if (tipo == 2) {
            porcentaje = 7;
        } else if (tipo == 3) {
            porcentaje = 9;
        } else if (tipo == 4) {
            porcentaje = 12;
        } else {
            porcentaje = 15;
        }

        incremento = sueldoInicial * porcentaje / 100;

        if (aniosServicio < 2) {
            bonificacion = 0;
        } else if (aniosServicio < 5) {
            bonificacion = 30;
        } else if (aniosServicio < 10) {
            bonificacion = 60;
        } else {
            bonificacion = 100;
        }

        nuevoSueldo = sueldoInicial + incremento + bonificacion;

        System.out.println("\nREPORTE DE INCREMENTO SALARIAL");
        System.out.println("Empleado: " + empleado);
        System.out.println("Tipo de empleado: " + tipo);
        System.out.println("Años de servicio: " + aniosServicio);
        System.out.printf("Sueldo inicial: $%.2f%n", sueldoInicial);
        System.out.println("Porcentaje de incremento: " + porcentaje + "%");
        System.out.printf("Incremento salarial: $%.2f%n", incremento);
        System.out.printf("Bonificación por antigüedad: $%.2f%n", bonificacion);
        System.out.printf("Nuevo sueldo: $%.2f%n", nuevoSueldo);
    }
}

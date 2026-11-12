
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

        System.out.println("Ingrese el nombre del empleado:");
        empleado = entrada.nextLine();

        System.out.println("Ingrese el tipo de empleado:");
        tipo = entrada.nextInt();

        System.out.println("Ingrese los años de servicio:");
        aniosServicio = entrada.nextInt();

        System.out.println("Ingrese el sueldo inicial:");
        sueldoInicial = entrada.nextDouble();

        if (tipo == 1) {
            porcentaje = 5;
        } else {
            if (tipo == 2) {
                porcentaje = 7;
            } else {
                if (tipo == 3) {
                    porcentaje = 9;
                } else {
                    if (tipo == 4) {
                        porcentaje = 12;
                    } else {
                        porcentaje = 15;
                    }
                }
            }
        }

        incremento = (sueldoInicial * porcentaje) / 100;

        if (aniosServicio < 2) {
            bonificacion = 0;
        } else {
            if (aniosServicio < 5) {
                bonificacion = 30;
            } else {
                if (aniosServicio < 10) {
                    bonificacion = 60;
                } else {
                    bonificacion = 100;
                }
            }
        }

        nuevoSueldo = sueldoInicial + incremento + bonificacion;

        System.out.printf("REPORTE DE INCREMENTO SALARIAL\n\n"
                + "Empleado: %s\n"
                + "Tipo de empleado: %d\n"
                + "Años de servicio: %d\n\n"
                + "Sueldo inicial: $%.2f\n"
                + "Porcentaje de incremento: %d%%\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificación por antigüedad: $%.2f\n\n"
                + "Nuevo sueldo: $%.2f\n",
                empleado,
                tipo,
                aniosServicio,
                sueldoInicial,
                porcentaje,
                incremento,
                bonificacion,
                nuevoSueldo);
    }
}

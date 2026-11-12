
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author steve
 */
public class Problema02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String propietario;
        String descripcion;
        int tipo;
        double avaluo;
        double porcentaje;
        double valorFijo;
        double valorBase;
        double recargo = 0;
        double total;

        System.out.println("PEAJE BUENA VÍA");

        System.out.println("Ingrese el nombre del propietario:");
        propietario = entrada.nextLine();

        System.out.println("TIPOS DE VEHÍCULOS\n"
                + "1. Vehículo liviano particular\n"
                + "2. Vehículo grande particular\n"
                + "3. Taxi\n"
                + "4. Bus urbano");

        System.out.println("Ingrese el tipo de vehículo:");
        tipo = entrada.nextInt();

        if (tipo >= 1 && tipo <= 4) {

            System.out.println("Ingrese el avalúo comercial:");
            avaluo = entrada.nextDouble();

            if (tipo == 1) {
                descripcion = "Vehículo liviano particular";
                porcentaje = 0.01;
                valorFijo = 2.00;
            } else {
                if (tipo == 2) {
                    descripcion = "Vehículo grande particular";
                    porcentaje = 0.02;
                    valorFijo = 2.50;
                } else {
                    if (tipo == 3) {
                        descripcion = "Taxi";
                        porcentaje = 0.04;
                        valorFijo = 1.50;
                    } else {
                        descripcion = "Bus urbano";
                        porcentaje = 0.05;
                        valorFijo = 2.20;
                    }
                }
            }

            valorBase = (avaluo * porcentaje) / 100 + valorFijo;

            if (tipo == 1 || tipo == 2) {
                if (avaluo > 30000) {
                    recargo = 1.50;
                }
            }

            total = valorBase + recargo;

            System.out.printf("Peaje \"Buena Vía\"\n"
                    + "Propietario: %s\n"
                    + "Tipo: %s\n"
                    + "Avalúo: $%.2f\n"
                    + "Valor base del peaje: $%.2f\n"
                    + "Recargo: $%.2f\n\n"
                    + "Total a cancelar: $%.2f\n",
                    propietario,
                    descripcion,
                    avaluo,
                    valorBase,
                    recargo,
                    total);

        } else {
            System.out.println("El tipo de vehículo no es válido.");
        }
    }
}

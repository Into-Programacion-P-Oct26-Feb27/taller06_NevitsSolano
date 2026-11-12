
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg01.solución.b;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author steve
 */
public class Problema01SoluciónB {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion;
        double numero1;
        double numero2;
        double resultado = 0;
        String operacion = "";

        System.out.println("OPERACIONES ARITMÉTICAS\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicación\n"
                + "4. División\n"
                + "5. Módulo\n"
                + "6. Potencia");

        System.out.println("Seleccione una operación:");
        opcion = entrada.nextInt();

        if (opcion >= 1 && opcion <= 6) {

            System.out.println("Ingrese el primer número:");
            numero1 = entrada.nextDouble();

            System.out.println("Ingrese el segundo número:");
            numero2 = entrada.nextDouble();

            if (numero1 > numero2) {

                if ((opcion == 4 || opcion == 5) && numero2 == 0) {
                    System.out.println("No se puede dividir entre cero.");
                } else {

                    switch (opcion) {

                        case 1:
                            resultado = numero1 + numero2;
                            operacion = "Suma";
                            break;

                        case 2:
                            resultado = numero1 - numero2;
                            operacion = "Resta";
                            break;

                        case 3:
                            resultado = numero1 * numero2;
                            operacion = "Multiplicación";
                            break;

                        case 4:
                            resultado = numero1 / numero2;
                            operacion = "División";
                            break;

                        case 5:
                            resultado = numero1 % numero2;
                            operacion = "Módulo";
                            break;

                        case 6:
                            resultado = Math.pow(numero1, numero2);
                            operacion = "Potencia";
                            break;

                        default:
                            System.out.println("La opción seleccionada no es válida.");
                            break;
                    }

                    System.out.printf("OPERACIONES ARITMÉTICAS\n\n"
                            + "Primer número: %.2f\n"
                            + "Segundo número: %.2f\n"
                            + "Operación seleccionada: %s\n\n"
                            + "Resultado: %.2f\n",
                            numero1,
                            numero2,
                            operacion,
                            resultado);
                }

            } else {
                System.out.println("No es posible realizar la operación solicitada."
                        + " El primer número debe ser mayor que el segundo.");
            }

        } else {
            System.out.println("La opción seleccionada no es válida.");
        }
    }
}


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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double numero1;
        double numero2;
        double resultado;
        int opcion;
        String operacion;

        System.out.println("OPERACIONES ARITMÉTICAS");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Potencia");

        System.out.print("Seleccione una operación: ");
        opcion = entrada.nextInt();

        if (opcion >= 1 && opcion <= 6) {

            System.out.print("Ingrese el primer número: ");
            numero1 = entrada.nextDouble();

            System.out.print("Ingrese el segundo número: ");
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
                            resultado = 0;
                            operacion = "Opción no válida";
                            break;
                    }

                    System.out.println("\nOPERACIONES ARITMÉTICAS");
                    System.out.println("Primer número: " + numero1);
                    System.out.println("Segundo número: " + numero2);
                    System.out.println("Operación seleccionada: " + operacion);
                    System.out.println("Resultado: " + resultado);

                }

            } else {
                System.out.println("No es posible realizar la operación.");
                System.out.println("El primer número debe ser mayor que el segundo.");
            }

        } else {
            System.out.println("La opción seleccionada no es válida.");
        }
    }
}

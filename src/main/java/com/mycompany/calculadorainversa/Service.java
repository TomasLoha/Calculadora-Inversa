/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorainversa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 *
 */
public class Service {

    public void starter() {
        System.out.println("Bienvenudo a Calculadora Inversa!!!");
    }

    public void menu(Scanner reader) {

        Set<String> set_de_numeros = new HashSet<>();
        boolean salida = false;
        int eleccion;
        Parametros parametro = new Parametros();
        do {
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║                   Menú                ║");
            System.out.println("╠═══════════════════════════════════════╣");
            System.out.println(" 1. Ingresar Resultado        ");
            System.out.println(" 2. Sumas       ");
            System.out.println(" 3. Restas        ");
            System.out.println(" 4. Ingresar Condicion        ");
            System.out.println(" 5. Mostrar Resultado Sin Guardado        ");
            System.out.println(" 6. Mostrar Ultimo Resultado Guardado");
            System.out.println(" 7. Salir           ");
            System.out.println("╚═══════════════════════════════════════╝");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            eleccion = reader.nextByte();
            System.out.println("");
            switch (eleccion) {
                case 1:

                    parametro.crearParametroResultadoOnly(reader);

                    break;
                case 2:

                    calcularSumaInversa(set_de_numeros, parametro);

                    break;
                case 3:

                    System.out.println("Opcion no valida de momento");

                    break;
                case 4:

                    System.out.println("Opcion no valida de momento");

                    break;
                case 5:

                    mostrarSumaInversa(parametro);

                    break;
                case 6:

                    mostrarSet(set_de_numeros);

                    break;
                case 7:

                    salida = true;

                    break;
                default:
                    System.out.println("La opcion ingresada no es valida vuelva a intentarlo");

            }

        } while (!salida);

        System.out.println("Ha salido del programa");
    }

    public void mostrarSumaInversa(Parametros parametro) {

        for (int i = 0; i < (parametro.getResultado() / 2); i++) {
            for (int j = 0; j < parametro.getResultado(); j++) {
                if (i + j == parametro.getResultado()) {
                    System.out.println(i + " + " + j + " = " + parametro.getResultado());
                }
            }
        }

    }

    public void calcularSumaInversa(Set<String> set_de_numeros, Parametros parametro) {
        int resultado = (int) parametro.getResultado();
        int cont = 0;
        for (int i = 0; i <= resultado / 2; i++) {
            int j = resultado - i;
            if (!set_de_numeros.contains(i + " + " + j + " = " + resultado)) {
                set_de_numeros.add(i + " + " + j + " = " + resultado);
                cont++;
            }
        }
        if (resultado >= 2) {
            long combinacion = calcularCombinaciones(resultado, 2);
            System.out.println("Cantidad de cálculos únicos (utilizando la fórmula de combinación): " + combinacion);
        } else {
            System.out.println("Cantidad de cálculos únicos (utilizando la fórmula de combinación): 0");
        }
    }

    // Método para calcular el factorial de un número
    private static long factorial(int n) {
        try {
            if (n == 0) {
                return 1;
            }
            long factorial = 1;
            for (int i = 1; i <= n; ++i) {
                factorial *= i;
            }
            return factorial;
        } catch (Exception e) {
            System.out.println("Error Nivel 1");
            System.out.println(e.getLocalizedMessage());
        }
        return 1;
    }

    // Método para calcular el número de combinaciones de "n" elementos tomados de "k" en "k"
    public static long calcularCombinaciones(int n, int k) {
        if (k > n) {
            throw new IllegalArgumentException("El valor de k no puede ser mayor que n");
        }
        try{
            System.out.println(k + " " + n);
        return factorial(n) / (factorial(k) * factorial(n - k));
        }catch(Exception e){
            System.out.println("Error Nivel 2");
            System.out.println(e.getLocalizedMessage());
        }
        return 1;
    }

    public static void mostrarSet(Set<String> set) {
        System.out.println("Elementos del conjunto:");
        for (String elemento : set) {
            System.out.println(elemento);
        }
    }
}

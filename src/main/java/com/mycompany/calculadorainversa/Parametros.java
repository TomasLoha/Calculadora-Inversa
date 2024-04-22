/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorainversa;

import java.util.Scanner;

/**
 *
 * @author oscarloha
 */
public class Parametros {
    
    private int A;
    private int B;
    private int resultado;

    public Parametros() {
    }

    public Parametros(int A, int B, int resultado) {
        this.A = A;
        this.B = B;
        this.resultado = resultado;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public long getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
   
    
    public  void crearParametro(Scanner reader){
        System.out.println("Ingrese el primer numero");
        this.A = reader.nextInt();
        System.out.println("Ingrese el segundo numero");
        this.B = reader.nextInt();
    }
    public  void crearParametroResultadoOnly(Scanner reader){
        System.out.println("Ingresa el resultado: ");
        
        this.resultado = reader.nextInt();
    }
}

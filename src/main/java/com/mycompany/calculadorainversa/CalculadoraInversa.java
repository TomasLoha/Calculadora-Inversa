/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorainversa;

import java.util.Scanner;


public class CalculadoraInversa {

    static Scanner reader = new Scanner(System.in);
    
    public static void main(String[] args) {
        Service service = new Service();
        
        service.menu(reader);
        
    }
}

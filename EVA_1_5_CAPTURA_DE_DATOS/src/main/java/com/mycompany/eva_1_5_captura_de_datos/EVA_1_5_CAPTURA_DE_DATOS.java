/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_1_5_captura_de_datos;

import java.util.Scanner;

/**
 *
 * @author irvingvalles
 */
public class EVA_1_5_CAPTURA_DE_DATOS {

    public static void main(String[] args) {
        //TODO code aplication logic here
        //DECLARAR NUESTRAS VARIBALES
        String nombre; 
        int edad;
        System.out.println("introduce tu nombre:");
       
        //CREAR NUESTRO SCANNER
        Scanner captura = new Scanner (System.in);
        
        //CAPTURA 
        nombre = captura.nextLine();
        System.out.println("Introduce tu edad");
        edad = captura.nextInt();
        
        System.out.println("Tu nombre es:");
        System.out.println(nombre);
        System.out.println("Tu edad es:");
        System.out.println(edad);


        
        
    }   
}

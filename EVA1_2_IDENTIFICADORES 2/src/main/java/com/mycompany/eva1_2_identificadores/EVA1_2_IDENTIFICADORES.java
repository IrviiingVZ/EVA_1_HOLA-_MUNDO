/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_2_identificadores;

/**
 *
 * @author irvingvalles
 */
public class EVA1_2_IDENTIFICADORES {

    public static void main(String[] args) {
        //  todo code aplication logic here
            //VARIABLES:
        //TIPO DE DATO NOMBRE DEL IDENTIFICADOR}
        //short int byte long --> Enteros
        //float double --> Numeros con decimal 
        //char --> verdadero o falso 
        //String -- Cadenas de texto
        //si NO se declara una variable, NO se puede usar
        
        int Edad; //Declaracion de una variable
        String Nombre ; //No palabra reservada
        double Salario ; 
        
        //ASIGNACION DE VALORES:
        //IDENTIFICADOR = VALOR;
        //Se coloca el valor 50 dentro de la variable edad
        
        Edad=50 ;
        Nombre = "Juan Perez Jolote";
        //Se usa "" para que sea un texto si no luego piensa que es una variable.
        Salario = 123.56;
        //COMO LOS USAMOS:
            System.out.print("su nombre es: ");
            System.out.print(Nombre);
            System.out.print("su edad: ");
            System.out.print(Edad);
            System.out.print("Su salario es: ");
            System.out.print(Salario);
    }
}

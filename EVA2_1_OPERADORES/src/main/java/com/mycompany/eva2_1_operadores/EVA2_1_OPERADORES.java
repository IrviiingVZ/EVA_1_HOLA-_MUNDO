/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_operadores;

/**
 *
 * @author irvingvalles
 */
public class EVA2_1_OPERADORES {

    public static void main(String[] args) {
        //Operadores aritmeticos: 
        //Suma +, resta -, Multiplicacion *, divisoon /
        
        int num1, num2;
        num1 = 5;
        num2 = 3;
        int suma = 5 + 3; 
        // Si en el operador + no de los terminos es 
        //una cadena, todo se convierte a cadena y se unen 
        //concatenacion: union de cadenas de texto 
        System.out.println("La suma es " + suma);
        boolean prueba = true; 
        System.out.println("El valor de prueba es " + prueba);
        
        //Multiplicacion *
        int multi;
        multi =num1 * num2;
        System.out.println("La multiplicacion es " + multi);
        
        //Division / 
        int divi = num1 / num2;
        System.out.println("La disvion de 5 / 3 es " +divi);
        double diviDouble = 7 / 2;
        System.out.println("La division (double es de 7 / 2 es)" + diviDouble);
        //Numeros exactos (Numeros dobles)
        
        //Acumuladores
        //Suma +=, resta -=, multi *=, Divi /=
        int sumatoria = 0;
        /*sumatoria = sumatoria + 90;
        sumatoria = sumatoria + 80;
        sumatoria = sumatoria + 80;*/
        sumatoria +=90; //agrego 90 a sumatoria
        sumatoria +=80; //agrego 80 a sumatoria
        sumatoria +=80; //agrego 80 a sumatoria
        
        //Ctrl+shift+flechas=Duplicar
        System.out.println("La sumatoria es " + sumatoria);
        sumatoria -= 70;
        System.out.println("la sumatoria es " + sumatoria);
        }
}

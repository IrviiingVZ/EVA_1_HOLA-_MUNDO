/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_asignatura;

import java.util.Scanner;

/**
 *
 * @author irvingvalles
 */
public class EVA1_5_ASIGNATURA {

    public static void main(String[] args) {
        //clave, nombre, creditos, hrTeo, hrPr, carrera
        //tipoMat  
        String clave, nombre, carrera;
        int creditos, horasTeo, horasPrac;
        boolean tipoMat;
        //CAPTURAR
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la clave de la asignatura:");
        clave = captu.nextLine();
        System.out.println("Introduce el nombre de la asignatura:");
        nombre = captu.nextLine();
        System.out.println("Introduce la carrera  de la asignatura:");
        carrera = captu.nextLine();
        System.out.println("Introduce los creditos de la asignatura");
        creditos = captu.nextInt();
        System.out.println("Introduce las horas teoricas de la asignatura:");
        horasTeo = captu.nextInt();
        System.out.println("Introduce las horas practicas de la asignatura [true --> generica, false --> especcial]");
        horasPrac = captu.nextInt();
        System.out.println("Introduce el tipo de la asignatura:");
        tipoMat= captu.hasNextBoolean(); 
        
        //HACER ALGO CON LOS DATOS CAPTURADOS 
        System.out.println("DATOS DE LA ASINNATURA");
        System.out.println(clave);
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(creditos);
        System.out.println(horasTeo);
        System.out.println(horasPrac);
        System.out.println(tipoMat);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5_ej_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Camila Pc
 * Un empleado desea almacenar en un vector sus 12 sueldos del año.
 * A partir de esto, necesita un programa que determine y muestre por pantalla 
 * la suma total de sus 12 sueldos y el promedio de sueldos que tuvo en el años.
 */
public class Clase5_ej_4 {

    public static void main(String[] args) {
        int vector[] = new int[12];
        Scanner teclado = new Scanner (System.in); 
        
        for(int i = 0; i <= 11; i++){
            System.out.println("Ingrese la suma para el sueldo del mes " + (i+1) + ": " );
            vector[i] = teclado.nextInt();
        }
        System.out.println("Sueldos: " + Arrays.toString(vector));
        double  sumatotal = 0;
        for(int i= 0; i<vector.length; i++){
            sumatotal += vector[i];
        }
        System.out.println("La suma de todos los sueldos es de: " + sumatotal );
        System.out.println("El promedio de sueldos del año es de: " + (sumatotal/12));
        }
    
    }
    


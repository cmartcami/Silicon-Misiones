/*
Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, 
Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila. Realizar un recorrido
del vector para cargar los datos y otro para mostrar los mismos en pantalla.
 */
package clase_5_ej_1;

/**
 * @author Camila Pc
 */
import java.util.Arrays;
import java.util.Scanner;
        
public class Clase_5_ej_1 {

    public static void main(String[] args) {
        String vector[] = new String [8];
        Scanner teclado = new Scanner (System.in);
    
        for (int i = 0; i <= 7; i++ ){
            System.out.println("Ingrese el nombre para el índice " + i + ":");
            String pattern = null;
            vector[i] = teclado.nextLine();
        }
        System.out.println("Vector con nombres: " + Arrays.toString(vector));
    }
    
    }
    

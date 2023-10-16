
package ejercicio_inputteclado;

import java.util.Scanner;

public class Ejercicio_InputTeclado {

    public static void main(String[] args) {
        /* 
            Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra "salir"
        
        */
        
        System.out.println("Ingresa una palabra, para salir escribe 'salir'");
        Scanner input = new Scanner(System.in);
        String Palabra = input.next();

        
        
        // en los string no podemos usar != para comparar strings, usamos !Palabra.queals 
        //.equalsIgnoreCase ignora si el input es en mayusculas o minusculas
        while (!Palabra.equalsIgnoreCase("salir") ){
            System.out.println("Palabra: " + Palabra);
            // le vuelvo a pedir que ingrese algo
            Palabra = input.next();
        }
        
        
        
    }
    
}

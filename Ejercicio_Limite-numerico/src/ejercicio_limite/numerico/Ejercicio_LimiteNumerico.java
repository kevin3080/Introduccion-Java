/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_limite.numerico;

import java.util.Scanner;

/**
 *
 * @author SuperUsuario
 */
public class Ejercicio_LimiteNumerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
            Realizar un programa que dado por teclado un limite numero
        por teclado ( por ejemplo 100) muestre en pantalla todos los numero hasta ese limite (empezando por 1).
       
        */
        int cont = 0;
        int numeroProporcionado;
        
        System.out.println("Ingrese un numero: ");
        
        Scanner input = new Scanner(System.in);
        numeroProporcionado = input.nextInt();
        
        
        if(numeroProporcionado >= 0){
            for(cont = 1; cont <= numeroProporcionado; cont ++){
                System.out.println("Conteo: " + cont);
            }
        }
        
        
    }
    
}

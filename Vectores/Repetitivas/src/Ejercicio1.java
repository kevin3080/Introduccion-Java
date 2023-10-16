import java.util.Scanner;

public class Ejercicio1 {

    /* Realizar un programa que permita cargar 15 números en un vector. Una vez cargados,
     * se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el numero 3
     */

    public static void main(String[] args) throws Exception {


        //1. Declaramos nuestro vector
        int vector [] = new int [15];
        //2. Declaramos nuestro scanner para ingresar datos por teclado
        Scanner teclado = new Scanner(System.in);

        // cargar nestro vector
        for(int i = 0; i < 15; i++ ){
            System.out.println("ingrese un número para el vector:");   
            vector[i] = teclado.nextInt();
        }
        teclado.close();
        // recorrer y contar cuántos números 3 hay
        // declaramos una variable auxiliar contador para ir contando la cantidad de numeros 3
        int contador = 0;
        for(int i = 0; i < 15; i++){
            if(vector[i] == 3){
                contador +=1;
            }
        }

        System.out.println("La cantidad de numeros 3 que hay en el vector es: " + contador);

    }
}

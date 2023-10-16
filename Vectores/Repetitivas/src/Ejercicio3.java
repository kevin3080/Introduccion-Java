import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        /*   Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, 
         * Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y ludmila. Realizar un recorrido del
         * vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla
        */

        String vector[] = new String[8];
        Scanner teclado = new Scanner(System.in);
        String acumulador = "";

        for(int i = 0; i < vector.length; i++){
            System.out.println("Ingrese un nombre:");
            vector[i] = teclado.nextLine();
            acumulador += vector[i] + " ";
        }
        teclado.close();     
        
        for(int i = 0; i < vector.length; i++){
            System.out.println("el nombre: " + vector[i] + " esta en el indice: " + i);
        }

        System.out.println("Todos los nombres son: " + acumulador);


    }
}

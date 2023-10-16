/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

/**
 *
 * @author SuperUsuario
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1 = 0;
        
        while ( num1 <= 10) {
            System.out.println("Estoy en el numero: " + num1);
            num1 = num1 +1;
            // break;
        }
        
        // ejemplo For
        for(int cont=0; cont<=10;cont++){
            System.out.println("Con ciclo for, Estoy en el numero: "+ cont);
        }
        
    }
    
}

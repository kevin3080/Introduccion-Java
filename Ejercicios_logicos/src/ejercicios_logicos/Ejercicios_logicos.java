/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_logicos;

/**
 *
 * @author SuperUsuario
 */
public class Ejercicios_logicos {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1 = 35;
        int numero2 = 20;
        
        int numeroAux = 0;
        
        System.out.println("-------Antes---------");
        System.out.println("num1: " + numero1 );
        System.out.println("num2: "+ numero2);
        
        numeroAux = numero2;
        numero2 = numero1;
        numero1= numeroAux;
        
        System.out.println("------------------Ahora-----------------");
        System.out.println("num1: " + numero1);
        System.out.println("num2: " + numero2);
        
        
        
        int num1 = 10;
        int num2 = 10;
        
        if (num2 > num1){
            System.out.println("El num2 es mayor al num1");
        }
        else{
            if ( num1 == num2 ){
                System.out.println("Los numeros son iguales");
            }else{
                System.out.println("El num1 es mayor al num2");
            }
        }
        
        
        int dia = 1;
        String nombreDia;
        
        switch (dia) {
            case 1: nombreDia = "Lunes";
            break;
            case 2: nombreDia = "Martes";
            break;
            case 3: nombreDia = "Miercoles";
            break;
            case 4: nombreDia = "Jueves";
            break;
            case 5: nombreDia = "Viernes";
            break;
            case 6: nombreDia = "Sabado";
            break;
            case 7: nombreDia = "Domingo";
            break;
            default: nombreDia = "numero de dia invalido"; // si la persona ingresa un caso distinto
            break;
        }
        
        System.out.println("El dia de la semana seleccionado es: " + nombreDia);
        
    }
    
}

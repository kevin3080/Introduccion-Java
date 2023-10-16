
package ejercicio_largo;

import java.util.Scanner;

public class Ejercicio_Largo {

    public static void main(String[] args) {
        /* En la ciudad Obrerá, Misiones se realiza año a año la "Maraton del inmigrante" en el marco de la Fiesta Nacional 
        del inmigrante. El evento cuenta con un dia de inscripciones del dia anterior a la carrera, por lo que se desconoce la cantidad 
        exacta de inscriptos que puede llegar a haber. Desde la Federacion de colectividades ( organismo que organiza),
        manifestaron que se solicitan los siguientes datos para la inscripcion de cada participante: dni, nombre y edad.
        En cuanto a las categorias posibles para una inscripcion, se manejan las siguientes:
        
        Menores A (de 6 a 10 años)
        Menores B (de 11 a 17 años)
        Juveniles (de 18 a 30 años)
        Adultos(de 31 a 50 años)
        Adultos mayores (mayores de 50 años)
        
        
        Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla a que categoria
        debe ser inscrito. Cabe destacar que, al finalizar el dia, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0
        y un nombre con la palabra fin.
        */
        
        
        // Pedir datos a las personas: dni, nombre, edad
        // Determinar a que categoria se tiene que inscribir
        // informarle a la persona
        // no sabemos la cantidad de personas
        
        System.out.println("Ingrese el dni de la persona");
        Scanner Teclado = new Scanner(System.in);
        String dni = Teclado.next();
        System.out.println("Ingrese el nombre de la persona ");
        String nombre = Teclado.next();
        System.out.println("Ingrese la edad");
        Scanner Edad = new Scanner(System.in);
        int edad = Edad.nextInt();
        
        
        while(!dni.equals("0")  &&  !nombre.equalsIgnoreCase("fin") ){
            /* 
            Menores A (de 6 a 10 años)
            Menores B (de 11 a 17 años)
             Juveniles (de 18 a 30 años)
            Adultos(de 31 a 50 años)
            Adultos mayores (mayores de 50 años)
            
            */
            if(edad >= 6 && edad <= 10){
                System.out.println("La categoria es Menores A" );
            }else{
                if( edad >= 11 && edad <= 17 ){
                     System.out.println("La categoria es Menores B" );
                }else{
                    if(edad >= 31 && edad <= 50){
                         System.out.println("La categoria es Adultos" );
                    }else{
                        if(edad > 50 ){
                             System.out.println("La categoria es Adultos mayores" );
                        }else{
                            System.out.println("La persona no cuenta con la edad indicada");
                        }
                    }
                }
            }
            System.out.println("Ingrese el dni de la persona");
            dni = Teclado.next();
            System.out.println("Ingrese el nombre de la persona ");
            nombre = Teclado.next();
            System.out.println("Ingrese la edad");
            edad = Edad.nextInt();
        }
        
        
        
    }
    
}

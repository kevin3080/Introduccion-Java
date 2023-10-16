
package arbolito_de_navidad;


public class Arbolito_de_navidad {


    public static void main(String[] args) {
        
        // declarar la altura del arbol
        int altura = 50;
        
        // buble para recorrer todas las filas (altura)
        for(int fila = 0 ; fila < altura ; fila++){
           // buble para los espacios
           for(int espacio = 0; espacio <(altura - fila - 1); espacio ++){
              
               System.out.print(" ");
           }
           // buble para los asteriscos
           for(int asterisco = 0 ; asterisco < (fila*2)+1 ; asterisco++) {
            System.out.print("*");
        }
         
            System.out.println("");
           
        } 
        
         // tronco
         
         int LargoTronco = 5;
         for(int base=0; base < LargoTronco; base++){
                // espacios en blanco
                for( int espacio = 0; espacio < (altura - 2) ; espacio ++ ){
                    System.out.print(" ");
                 }
                
                // barritas del tronco
                for( int tronco = 0 ; tronco < 3 ; tronco ++ ){
                    System.out.print("|");
                }
                System.out.println("");
         }
         
         
         
        
        
        
        
         /*
        
        
    * 
   *** 
  *****      
********        
    ||| 
*/ 
        
    }
    
}

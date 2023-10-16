package holamundo;

public class HolaMundo {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        System.out.println("Hola que tal?");
        System.out.println("asdad");
        
        /*   
        Variables:
        Entreo => int => ej: 0, 1, 23, 54, 664, etc
        Decimales => double => ej: 1,3 ; 4,5 ; 234,55; etc
        Boobleanos => Bolean => true / false
        Caracteres => char => 'a', 'b', 'I' etc
        Cadena de Caracteres/ Texto => string => "Hola mundo, probando 123"
        Entrero Largo => long => numeros entre (-9.223.372.036.854.775.808 y 9.223.372.036.854.775.807)
        
        declaracion de variables
        tipo de dato | nombre;
        
        int numero = 2;
        */
        
        int numero = 2;
        
        int numero2 = 44;
  
        
        double Temperatura = 35.5;
        
        
        // condicionales
        
        if(numero == 2){
            System.out.println("es true");
        }else{
            System.out.println("es false");
        }
        
        if(numero2 >= Temperatura){
            System.out.println("El numero2 es mayor a la temperatura");
        }
        
    }
    
}

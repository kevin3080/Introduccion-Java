import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        /* En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas 
         * de 5 ciudades de la provincia de Misiones. En el primer vector se guardan los nombres de las 
         * ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero las temperaturas
         * máximas alcanzadas en la última semana. Se necesita un programa que permita la carga de las ciudades,
         * sus temperaturas mínimas y máximas; además, deberá poder informar por pantalla cual fue la ciudad con la
         * temperatura más baja y cual con la temperatura más alta (dando a conocer al mismo tiempo la cantidad de 
         * grados).
        */

        // crear tres vectores: ciudades, temp mínima, temp máxima
        String ciudades[] = new String[5];
        Double[] tempMin = new Double[5];
        Double tempMax[] = new Double[5];

        // cargamos el scanner
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < ciudades.length; i++){
            System.out.println("ingresa la ciudad " + i);
            ciudades[i] = teclado.next();
            System.out.println("ingrese la temperatura mínima de esta ciudad");
            tempMin[i] = teclado.nextDouble();
            System.out.println("Ingrese ahora la temperatura máxima registrada");
            tempMax[i] = teclado.nextDouble();
        }
        teclado.close();
        
        String ciudadTempMin = ciudades[0];
        String ciudadTempMax = ciudades[0];
        Double minValue = tempMin[0];
        Double maxValue = tempMax[0];
        for(int i = 0; i < ciudades.length; i++){
            if(tempMin[i] < minValue ){
                minValue = tempMin[i];
                ciudadTempMin = ciudades[i];
            }
            if(tempMax[i] > maxValue){
                maxValue = tempMax[i];
                ciudadTempMax = ciudades[i];
            }
        }


        System.out.println("La ciudad con la temperatura mínima registrada es: " + ciudadTempMin + " con " + minValue + "°");
        System.out.println("La ciudad con la temperatura máxima registrada es: " + ciudadTempMax + " con " + maxValue + "°");


    }
}


import java.util.Scanner;

public class Ejercicio2 {
    /* En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria. Cada fila corresponde a las notas 
     * y al primedio de cada alumno. Se necesita un programa que permita a un profesor cargar, en las 3 posiciones (columnas) 
     * de cada fila, las notas del alumno y que en la última columna se calculen los promedios. Una vez realizados los cálculos,
     * se desea mostrar las 3 notas de cada alumno y el primedio correspondiente recorriendo la matriz
     */
    public static void main(String[] args) throws Exception {
        Double matriz[][] = new Double[4][4];
        Scanner teclado = new Scanner(System.in);
        Double suma = 0.0;

        // For para cargar
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length - 1; j++){
                System.out.println("ingrese el almunno n° " + i);
                matriz[i][j] = teclado.nextDouble();
                suma = suma + matriz[i][j];
            }
            matriz[i][3] = suma / 3;
            suma = 0.0;
        }
        teclado.close();
        
        // For para recorrer
        for(int i = 0; i < matriz.length; i++){
            System.out.println("Las notas del alumno n° " + i + " son:");
            for(int j = 0; j < matriz.length - 1; j++){
                System.out.println("Nota N° " + j + " " + matriz[i][j]);
            }
            System.out.println("El promedio de las notas es: " + matriz[i][3]);
        }
    }
}

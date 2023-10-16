public class App {
    public static void main(String[] args) throws Exception {
        
        // Tipos de arreglos:

        // Unidimensionales:
            /* Poseen únicamente filas o columnas. Un claro ejemplo
             * son los vectores.
             */
        // Bidimensionales:
            /* Comprenden tablas de valores, donde cada elemento esta 
            simultáneamente en una fila y una columna a la vez.
            Un ejemplo son las matrices.       
            */

        // ---------------------------------------------

        // Unidimensionales:
        // Declaracíon
        int vector [] = new int [4];

        // Asignación (manual)
        vector[0]=2; // en la posicion indice 0 guardar 2
        vector[1]=35;
        vector[2]=48;
        vector[3]=157;

     
        // Bidimensionales:
        // Declaracíon
        int matriz [][] = new int [3][3]; // la primera fila hace referencia la cantidad de posiciones horizontales, la segunda posicion vertical


        //Asignación (Manual):
        matriz[0][0] = 5; // indice x:0 y:0 guardar 5
        matriz[0][1] = 13; // indice x:0 y:1 guardar 13
        matriz[2][2] = 24; // indice x:2 y:2 guardar 24

        



    }
}

public class Ejercicio5 {
    public static void main(String[] args){
        /* LLevar a cabo un programa que permite cargar completamente con números 5 una matriz de 
         * 4x5 (4 filas, 5 columnas)
         */

        int matriz[][] = new int[4][5];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++ ){
                matriz[i][j] = 5;
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++ ){
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("\n");
        }
    }
}

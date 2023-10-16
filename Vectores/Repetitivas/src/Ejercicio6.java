import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
         * Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos
         * diariamente, uno por la mañana
         * otro al medio dia y otro por la noche. Para administrar estos datos utiliza
         * una matriz, donde cada fila
         * es un destino y en cada columna se guarda la cantidad de asientos
         * disponibles.
         * 
         * 1. Se necesita un programa que permita la carga de la matriz con la cantidad
         * de asientos para cada vuelo
         * 2. Al mismo tiempo, el programa debe permitir a un usuario ingresar el número
         * de destino al que quiere
         * dirigirse, el número de vuelo (dependiendo si quiere viajar a la mañana, al
         * mediodía o a la noche) y la
         * cantidad de pasajes que necesita.
         * 3. A partir de la solicitud del usuario, el programa debe controlar si hay la
         * cantidad suficiente de
         * asientos para la cantidad de psajes que se requiere. En caso de que asi sea,
         * se debe mostrar un cartel por
         * pantalla que diga "su reserva fue realizada con exito" y se debe descontar
         * del todal de asientos los
         * solicitados por el usuario. En caso de no haber más asientos disponibles, se
         * debe informar otro cartel que
         * diga
         * "Disculpe, no se pudo completar su operación dado que no hay asientos disponibles"
         * .
         * 
         * Desde la compañía de vuelos manifiestan que NO CONOCEN cuantas
         * ventas/reservas se hacen por dia. Por lo
         * cual, para finalizar las ventas se ingresa la palabra "finish"
         */

        // creamos la matriz vuelos
        int[][] vuelos = new int[6][3];

        // cargamos la matriz
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " horario " + c);
                vuelos[f][c] = teclado.nextInt();

            }
        }

        // venta de asientos
        String bandera = "";
        int destino, horario, asientos;
        while (!bandera.equalsIgnoreCase("finish")) { // equalsIgnoreCase: si es igual a, ignorando como este escrito
            System.out.println("Ingrese en N° de destino");
            destino = teclado.nextInt();
            System.out.println("Ingrese el horario de vuelo");
            horario = teclado.nextInt();
            System.out.println("¿Cuantos asientos desea?");
            asientos = teclado.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con éxito");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("Disculpa, no hay asientos disponibles");
                    }
                } else {
                    System.out.println("Horario no existente. Ingrese entre 0 y 2");
                }
            } else {
                System.out.println("Destino no existente. Ingrese entre 0 y 5");
            }
            System.out.println(
                    "¿Desea continuar reservando?. Ingrese finish para terminar o cualquier valor para seguir");
            bandera = teclado.next();
        }

        teclado.close();
    }
}

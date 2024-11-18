/******************************************************************************************************************
 *                                                                                                                *
 *                                       *** PROGRAMA EN JAVA ***                                                 *
 *                                                                                                                *
 *   Nombre del archivo : Adivina.java                                                                            *
 *   Autor              : Javier Unibaso Bilbao                                                                   *
 *   Fecha              : 18/11/2024                                                                              *
 *   Módulo             : Programación.                                                                           *
 *   Unidad Didáctica   : UD3 Estructuras de control.                                                             *
 *   Tarea              : Tarea de evaluación 01. Realiza un programa en Java (100%)                              *
 *                                                                                                                *
 * ----------------------------------------------------------------------------------------------------------------
 *   Descripción del programa:                                                                                    *
 *   - un programa que genere un número al azar del 1 al 100 (entero) y que dé pistas (mayor o menor)             *
 *     para que el usuario o usuaria lo adivine.                                                                  *
 * ----------------------------------------------------------------------------------------------------------------
 *   Enlace a la autoevaluación:                                                                                  *
 *   - https://drive.google.com/file/d/1AZDYmrDhEDCkcXDfIzbpbmqJ8rEBQW2W/view?usp=sharing                         *
 *                                                                                                                *
 ******************************************************************************************************************/
import java.util.*;

public class Adivina {

    private static final int MAX_NUM = 100;

    public static void main(String[] args) {

        Scanner leerTeclado = new Scanner(System.in);

        final int partidasGanadas = 0;

        intro();
        jugarPartida(leerTeclado, partidasGanadas);
        leerTeclado.close();

    }

    // Muestra las instrucciones del juego
    public static void intro() {

        System.out.println("El programa genera un número aleatorio del 1 al 100");
        System.out.println("El usuario o usuaria debe adivinarlo en máximo 10 intentos");
        System.out.println("El programa le dará pistas cada vez que falle");
        System.out.println();
    }

    // Método del juego
    public static void jugarPartida(Scanner leerTeclado, int partidasGanadas) {
        Random rand = new Random(20);
        int num = rand.nextInt(MAX_NUM) + 1;
        int numAdiv = 0;
        int partidasJugadas = 0;
        int intentosTotal = 0;
        int mejorPartida = 10;
        boolean jugarOtra = true;
        String jugarSiNo;

        do {
            System.out.println("Adivina un número del 1 al 100");

            for (int i = 1; i <= 10; i++) {
                System.out.print("Adivina el número:");
                numAdiv = leerTeclado.nextInt();
                System.out.println();
                if (i <= 10) {

                    if (numAdiv > num) {
                        System.out.println("El número es menor.");
                        intentosTotal++;
                        if (i == 10) {
                            System.out.println("No has adivinado el número secreto: " + num);
                        }

                    } else if (numAdiv < num) {
                        System.out.println("El número es mayor.");
                        intentosTotal++;
                        if (i == 10) {
                            System.out.println("No has adivinado el número secreto: " + num);
                        }

                    } else if (numAdiv == num) {
                        System.out.println("Has adivinado en " + i + " intentos.");
                        partidasGanadas++;
                        intentosTotal++;
                        if (mejorPartida > i) {
                            mejorPartida = i;
                        }

                        i = 10;
                    }
                }

            }
            partidasJugadas++;

            jugarOtra = otraPartida(leerTeclado);

        } while (jugarOtra == true);

        mostrarEstadisticas(partidasJugadas, intentosTotal, partidasGanadas, mejorPartida);
    }

    // Pregunta si quiere jugar otra vez
    public static boolean otraPartida(Scanner leerTeclado) {

        boolean jugarOtra = true;
        System.out.print("¿Quieres jugar otra vez (S/N)? ");
        String respuesta = leerTeclado.next().trim();
        System.out.println();
        if (!respuesta.toLowerCase().startsWith("s")) {
            jugarOtra = false;
        }
        return jugarOtra;
    }

    // Muestra las estadísticas
    public static void mostrarEstadisticas(int partidasJugadas, int intentosTotal, int partidasGanadas, int mejorPartida) {

        double intPorPartida = (double) intentosTotal / partidasJugadas;
        intPorPartida = Math.floor(intPorPartida * 10) / 10.0;
        Locale.setDefault(Locale.US);
        System.out.println("Resultados del juego:");
        System.out.println("Partidas jugadas: " + partidasJugadas);
        System.out.println("Intentos realizados: " + intentosTotal);
        System.out.println("Partidas ganadas: " + partidasGanadas);
        System.out.printf("Intentos por partida: %.1f\n", intPorPartida);
        System.out.println("Mejor partida: " + mejorPartida);

    }

}

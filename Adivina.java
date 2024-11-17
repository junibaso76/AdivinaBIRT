/******************************************************************************************************************
 *                                                                                                                *
 *                                       *** PROGRAMA EN JAVA ***                                                 *
 *                                                                                                                *
 *   Nombre del archivo : NotaMedia.java                                                                          *
 *   Autor              : Javier Unibaso Bilbao                                                                   *
 *   Fecha              : 17/11/2024                                                                              *
 *   Módulo             : Programación.                                                                           *
 *   Unidad Didáctica   : UD3 Estructuras de control.                                                             *
 *   Tarea              : Tarea Práctica 01.                                                                      *
 *                                                                                                                *
 * ----------------------------------------------------------------------------------------------------------------
 *   Descripción del programa:                                                                                    *
 *   - Calcular la nota media de un estudiante a partir de la calificación del examen parcial,                    *
 *     el examen final y las Unidades Didácticas realizadas durante el curso.                                     *
 * ----------------------------------------------------------------------------------------------------------------
 *   Enlace a la autoevaluación:                                                                                  *
 *   - https://drive.google.com/file/d/1AZDYmrDhEDCkcXDfIzbpbmqJ8rEBQW2W/view?usp=sharing                         *
 *                                                                                                                *
 ******************************************************************************************************************/

import java.util.*;

   public class Adivina{
   
   
       public static void main(String[] args) {
         
         Scanner leerTeclado = new Scanner(System.in);
         


         intro();
         jugarPartida(leerTeclado);
         //mostrarEstadisticas();
       
       }

   
      public static void intro() {
      
                
         System.out.println("El programa genera un número aleatorio del 1 al 100");
         System.out.println("El usuario o usuaria debe adivinarlo en máximo 10 intentos");
         System.out.println("El programa le dará pistas cada vez que falle");
         System.out.println();
       }
       
      public static void jugarPartida(Scanner leerTeclado) {
         Random rand = new Random();
         int num = rand.nextInt(100);
         int numAdiv = 0;
         int mejorPartida = 10;
         boolean jugarOtra = true;
         String jugarSiNo;
         do{
         System.out.println("Adivina un número del 1 al 100");
            for(int i = 1; i <= 10; i++){
               System.out.print("Adivina el número: ");
               numAdiv = leerTeclado.nextInt();
                  if(i == 10){
                  System.out.println("No has adivinado el número secreto: " + num);
                  }
                  if(numAdiv > num){
                  System.out.println("El número es menor.");
                  }else if(numAdiv < num){
                  System.out.println("El número es mayor.");
                  }
                  else if(numAdiv == num){
                  System.out.println("Has adivinado en " + i +" intentos." );
                     if(mejorPartida > i){
                     mejorPartida = i;
                     }
                  i = 10;
                  }
                  System.out.println(mejorPartida);
                             }
         System.out.print("¿Quieres jugar otra vez (S/N)? ");
         String respuesta = leerTeclado.next();
            if (!respuesta.toLowerCase().startsWith("s")) {
                jugarOtra = false;
             }
         }while (jugarOtra == true);
         
      }

       /*  public static void  mostrarEstadisticas() {
         
            
            System.out.println("Adivina un número del 1 al 100");
            System.out.println("El número es menor.");
            System.out.println("El número es mayor.");
            System.out.println("Has adivinado en  intentos." );
   
            System.out.println("¿Quieres jugar otra vez (S/N)? ");
         
      }*/
   
   }
   
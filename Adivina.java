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
         
         intro();
         jugarPartida();
         mostrarEstadisticas();
       
       }

   
      public static void intro() {
        
         System.out.println("El programa genera un número aleatorio del 1 al 100");
         System.out.println("El usuario o usuaria debe adivinarlo en máximo 10 intentos");
         System.out.println("El programa le dará pistas cada vez que falle");
         System.out.println();
       }
       
      public static void  jugarPartida() {
         
         
         System.out.println("Adivina un número del 1 al 100");
         System.out.println("El número es menor.");
         System.out.println("El número es mayor.");
         System.out.println("Has adivinado en " +   + " intentos." );

         System.out.println("¿Quieres jugar otra vez (S/N)? ");
         
      }

         public static void  jugarPartida() {
         
            
            System.out.println("Adivina un número del 1 al 100");
            System.out.println("El número es menor.");
            System.out.println("El número es mayor.");
            System.out.println("Has adivinado en " +   + " intentos." );
   
            System.out.println("¿Quieres jugar otra vez (S/N)? ");
         
      }


   
   
   
   
   
   
   
   }
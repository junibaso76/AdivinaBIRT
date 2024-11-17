/******************************************************************************************************************
 *                                                                                                                *
 *                                       *** PROGRAMA EN JAVA ***                                                 *
 *                                                                                                                *
 *   Nombre del archivo : NotaMedia.java                                                                          *
 *   Autor              : Javier Unibaso Bilbao                                                                   *
 *   Fecha              : 17/11/2024                                                                              *
 *   M�dulo             : Programaci�n.                                                                           *
 *   Unidad Did�ctica   : UD3 Estructuras de control.                                                             *
 *   Tarea              : Tarea Pr�ctica 01.                                                                      *
 *                                                                                                                *
 * ----------------------------------------------------------------------------------------------------------------
 *   Descripci�n del programa:                                                                                    *
 *   - Calcular la nota media de un estudiante a partir de la calificaci�n del examen parcial,                    *
 *     el examen final y las Unidades Did�cticas realizadas durante el curso.                                     *
 * ----------------------------------------------------------------------------------------------------------------
 *   Enlace a la autoevaluaci�n:                                                                                  *
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
        
         System.out.println("El programa genera un n�mero aleatorio del 1 al 100");
         System.out.println("El usuario o usuaria debe adivinarlo en m�ximo 10 intentos");
         System.out.println("El programa le dar� pistas cada vez que falle");
         System.out.println();
       }
       
      public static void  jugarPartida() {
         
         
         System.out.println("Adivina un n�mero del 1 al 100");
         System.out.println("El n�mero es menor.");
         System.out.println("El n�mero es mayor.");
         System.out.println("Has adivinado en " +   + " intentos." );

         System.out.println("�Quieres jugar otra vez (S/N)? ");
         
      }

         public static void  jugarPartida() {
         
            
            System.out.println("Adivina un n�mero del 1 al 100");
            System.out.println("El n�mero es menor.");
            System.out.println("El n�mero es mayor.");
            System.out.println("Has adivinado en " +   + " intentos." );
   
            System.out.println("�Quieres jugar otra vez (S/N)? ");
         
      }


   
   
   
   
   
   
   
   }
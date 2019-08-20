import java.util.Scanner;

/**

 * Permite encontrar el valor del impuesto y el precio neto del vehiculo

 *

 * @author WilderSanchez_NicolasRamirez

 * @version 18082019

 */

public class Ejercicio_2_4

{

     public static void main(String[] args)

  {

   Scanner teclado = new Scanner(System.in);

     

   double PB; // Corresponde al precio bruto del vehiculo: Dato de entrada

   double TV; // Corresponde al tipo de vehiculo: Dato de entrada

   double I; // Corresponde al valor del impuesto: Dato de salida

   double PN; //Corresponde al valor del precio neto del vehiculo: Dato de salida

  

 

       // Pasos a seguir para resolver todos los problemas

       // 1. Obtener los datos de entrada

       System.out.print("Por favor indique el cilindraje de su vehiculo: "); // Vehiculos > 2000 cc son camioneta

       TV = teclado.nextDouble();

       System.out.print("Por favor indicar el valor del vehiculo: ");

       PB = teclado.nextDouble();

 

             

       // 2. Hallar los datos de salida

      if(TV >= 2000){//corresponde a camioneta

                if (PB < 80){ //precio menor a 80

                 I = 0; // impuesto es = 0

                }

               else{ //precio mayor a 80

                    I = PB / 2; // impuesto = PB/2

                }

      if(TV <= 2000){//corresponde a automovil

                 if (PB < 20){ //precio menor a 20

                 I = 5; //impuesto es = 5

                }

                else{

                     if (PB > 20 && PB < 40){//precio entre 20 y 40

                              I = PB / 5;// impuesto = quinta parte

                            }

                            else{

                            I = 9; //impuesto es = 9

                                }

                            }

                        }

                       

                  PN = PB + I;

      

              // 3. Mostrar los datos de salida

       System.out.println("El valor del Impuesto es igual a: " + I);

       System.out.println("El valor del Precio Neto es igual a: " + PN);

 

      

    }

 }

}
import java.util.Scanner;

/**

 * Permite hallar el area sobrante entre un circulo y un cuadrado inmerso

 *

 * @author WilderSanchez_NicolasRamirez

 * @version 18082019

 */

public class Ejercicio_2_2

{

    public static void main(String[] args)

  {

   double r; // Corresponde al valor del radio: Dato de entrada

   double AS; // Corresponde al valor del area sombreada: Dato de salida

    

   Scanner teclado = new Scanner(System.in);

       // Pasos a seguir para resolver todos los problemas

       // 1. Obtener los datos de entrada

       System.out.print("Ingrese el valor del radio del circulo: ");

       r = teclado.nextDouble();

             

       // 2. Hallar los datos de salida

       AS = ((Math.PI) * Math.pow (r,2)) - (2 * Math.pow (r,2));

      

               

       // 3. Mostrar los datos de salida

       System.out.println("El área sombreada es igual a: " + AS);

             

    }

}
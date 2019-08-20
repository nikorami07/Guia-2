import java.util.Scanner;

/**

 * Permite buscar una lista en otra

 *

 * @author WilderSanchez_NicolasRamirez

 * @version 19082019

 */

public class Ejercicio_3_3

{

    public static void main(String[] args)

    {

       Scanner teclado = new Scanner(System.in);

       

        double Lista_A[]; //Correponde a la lista de tamaño n: Datos de entrada

        int n;            //La cantidad de elementos que hay en la lista A:Datos de entrada

        double Lista_B[]; //Correponde a la lista de tamaño p:Datos de entrada

        int p;            //La cantidad de elementos que hay en la lista B:Datos de entrada

        double Lista_C[]; //Corresponde a la lista C de los datos no comunes:Datos de salida

       

        System.out.print("Ingrese la cantidad de números de la lista A: ");

        n = teclado.nextInt();

       

        Lista_A = new double[n];

       

        //Leer todos los numeros

        for (int i = 0; i < n; i = i + 1) {

            System.out.print("Ingrese el numero # " + i +" ");

            Lista_A[i] = teclado.nextDouble(); 

    } 

    System.out.print("Ingrese la cantidad de números de la lista B: ");

        p = teclado.nextInt();

       

        Lista_B = new double[p];

       

        //Leer todos los numeros

        for (int i = 0; i < p; i = i + 1) {

            System.out.print("Ingrese el numero # " + i +" ");

            Lista_B[i] = teclado.nextDouble(); 

    }

double y;

    int posicion_de_y = -1;  //no lo he encontrado todavia 

      

    System.out.print("Cual elemento vamos a buscar: ");

    y = teclado.nextDouble();

   

    for (int i = 0; i < p; ++i) {

        if (Lista_B[i] == y) {

            posicion_de_y = i;

            break; //me permite finalizar el ciclo

        }

    }

    

    if (posicion_de_y == -1) {

        System.out.printf("El elemento %f no esta en el arreglo\n", y);

    }

    else {

        System.out.printf("El elemento %f esta en la posición %d del arreglo\n", y,

             posicion_de_y);

            }

          

    

        }

    }
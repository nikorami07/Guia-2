
import java.util.Scanner;

/**
 *
 * Permite calcular la desviacion estandar
 *
 *
 *
 * @author WilderSanchez_NicolasRamirez
 *
 * @version 19082019
 *
 */
public class Ejercicio_3_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numeros[]; //Un arreglo de numeros: Dato de entrada

        int n;            //La cantidad de elementos que hay en el arreglo: Dato de entrada

        double numero_desviacion; // numero a calcular la desviacion estandar

        double Desviacion; // la desviacion estandar de la lista: Dato de salida

        System.out.print("Ingrese la cantidad de números: ");

        n = teclado.nextInt();

        numeros = new double[n];

        //Leer todos los numeros
        for (int i = 0; i < n; i = i + 1) {

            System.out.print("Ingrese el numero # " + i + " ");

            numeros[i] = teclado.nextDouble();

        }

        double sumatoria = 0.0;

        for (int i = 0; i < numeros.length; i++) {

            sumatoria = sumatoria + numeros[i];

        }

        double promedio = sumatoria / n;

        double elevado = sumatoria - promedio;

        numero_desviacion = ((1 / (n - 1))) * (Math.pow((elevado), 2));

        Desviacion = Math.sqrt(numero_desviacion);

        System.out.printf("El promedio es %.3f\n", promedio);

        System.out.printf("La desviacion estandar es %.3f\n", Desviacion);

    }

}

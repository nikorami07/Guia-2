
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Soporte.Uno
 */
public class Ejercicio_2_3 {

    public static void main(String[] args) {
        {
            int capacidad, turistas, turistasPagos, cantidadViajes = 1, PagoTuristas, GananciaPropietario;

            Scanner teclado = new Scanner(System.in);

            System.out.print("ingrese la capacidad de personas que le caben al colectivo ");
            capacidad = teclado.nextInt();

            System.out.print("ingrese la cantidad de turistas a transportar ");
            turistas = teclado.nextInt();
            turistasPagos = turistas;

            for (int i = 2; turistas > capacidad; i++) {
                turistas = turistas - capacidad;
                cantidadViajes = i;
            }

            PagoTuristas = 10000 * turistasPagos;
            GananciaPropietario = 2000 * turistasPagos;

            System.out.println(" El colectivo con capacidad para " + capacidad + " personas requiere de " + cantidadViajes + " viajes para transportar los " + turistasPagos + " turistas. " + "\n " + "Los turistas deben pagar " + PagoTuristas + " pesos en total. El conductor debera pagarle al propietario la suma de: " + GananciaPropietario + " pesos.");

        }
    }
}

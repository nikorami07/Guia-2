
import java.util.Scanner;

public class Ejercicio_2_1 {

    public static void main(String[] args) {

        double pies = 0.0833;       //1 pulgada a 0.0833 pies
        double cent = 2.54;         //1 pulgada a 2.54 centimetros
        double leng = 190080.02;    //1 legua a 190080.02 pulgadas
        double yard = 36;           // 1 yarda a 36 pulgadas

        double dato;
        double resp = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la letra correspondiente a la medida que desea coonvertir a pies. " + "\n");
        System.out.print("Escriba: " + "\n" + "P para pies " + " \n");
        System.out.print("C para centimetros " + "\n");
        System.out.print("L para legua " + "\n");
        System.out.print("Y para yarda " + "\n");
        System.out.print(":" + "\n");

        String P = teclado.next();

        if ("P".equals(P)) {

            System.out.println("Introduzca el numero a convertir: ");
            dato = teclado.nextDouble();
            resp = dato / 12;
            System.out.println("El valor en pies es: " + resp);

        } else if ("C".equals(P)) {

            System.out.println("Introduzca el numero a convertir: ");
            dato = teclado.nextDouble();
            resp = dato * cent;
            System.out.println("El valor en centimetros es: " + resp);

        } else if ("L".equals(P)) {

            System.out.println("Introduzca el numero a convertir: ");
            dato = teclado.nextDouble();
            resp = dato * leng;
            System.out.println("El valor en pulgadas es: " + resp);

        } else if ("Y".equals(P)) {

            System.out.println("Introduzca el numero a convertir: ");
            dato = teclado.nextDouble();
            resp = dato * yard;
            System.out.println("El valor en pulgadas es: " + resp);

        } else {
            System.out.print("Ingrese un dato valido. " + "\n");
        }
    }
}

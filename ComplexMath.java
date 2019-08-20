
package numeroscomplejos;

/**
 *
 * @author Nicolas Ramirez
 */
public class ComplexMath {

    public ComplexMath() {

    }

    //Suma
    public static NumerosComplejos suma(NumerosComplejos a, NumerosComplejos b) {
        double x = a.getParteReal() + b.getParteReal();
        double y = a.getParteImaginaria() + b.getParteImaginaria();
        return new NumerosComplejos(x, y);
    }

    //Resta
    public static NumerosComplejos resta(NumerosComplejos a, NumerosComplejos b) {
        double x = a.getParteReal() - b.getParteReal();
        double y = a.getParteImaginaria() - b.getParteImaginaria();
        return new NumerosComplejos(x, y);
    }

    //Producto
    public static NumerosComplejos producto(NumerosComplejos a, NumerosComplejos b) {
        double x = a.getParteReal() * b.getParteReal() - a.getParteImaginaria() * b.getParteImaginaria();
        double y = a.getParteReal() * b.getParteImaginaria() + b.getParteReal() * a.getParteImaginaria();
        return new NumerosComplejos(x, y);
    }

    //division
    public static NumerosComplejos cociente(NumerosComplejos a, NumerosComplejos b) {
        double aux = b.getParteReal() * b.getParteReal() + b.getParteImaginaria() * b.getParteImaginaria();
        double x = (a.getParteReal() * b.getParteReal() + a.getParteImaginaria() * b.getParteImaginaria()) / aux;
        double y = (a.getParteImaginaria() * b.getParteReal() - a.getParteReal() * b.getParteImaginaria()) / aux;
        return new NumerosComplejos(x, y);
    }

    //Conversion de cartesiano a polar
    public static NumerosComplejos cartesianoPolar(NumerosComplejos c) {
        double angulo = Math.atan((c.getParteImaginaria() / c.getParteReal()));
        double p = Math.sqrt(Math.pow(c.getParteReal(), 2) + Math.pow(c.getParteImaginaria(), 2));
        return new NumerosComplejos(p, angulo);
    }

    //Conversion de cartesiano a polar
    public static NumerosComplejos polarCartesiano(NumerosComplejos c) {
        double x = c.getParteReal() * Math.cos(c.getParteImaginaria());
        double y = c.getParteReal()* Math.sin(c.getParteImaginaria());
        return new NumerosComplejos(x, y);
    }

}



package numeroscomplejos;

/**
 *
 * @author Nicolas Ramirez
 */
public class NumerosComplejos {

    private double parteReal;
    private double parteImaginaria;

    public NumerosComplejos(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    //Conjugado
    public NumerosComplejos conjugado() {
        return new NumerosComplejos(parteReal, parteImaginaria * (-1));
    }

    //Modulo
    public double modulo() {
        return Math.sqrt(parteReal * parteReal + parteImaginaria * parteImaginaria);
    }

    //Fase 
    public double fase() {
        double angulo = Math.atan(parteImaginaria / parteReal);
        return angulo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.parteReal) ^ (Double.doubleToLongBits(this.parteReal) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.parteImaginaria) ^ (Double.doubleToLongBits(this.parteImaginaria) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NumerosComplejos other = (NumerosComplejos) obj;
        if (Double.doubleToLongBits(this.parteReal) != Double.doubleToLongBits(other.parteReal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.parteImaginaria) != Double.doubleToLongBits(other.parteImaginaria)) {
            return false;
        }
        return true;
    }

    

    public static void main(String[] args) {
        NumerosComplejos a = new NumerosComplejos(5, -1);
        NumerosComplejos b = new NumerosComplejos(4, -3);
        NumerosComplejos suma = ComplexMath.suma(a, b);
        NumerosComplejos producto = ComplexMath.producto(a, b);
        NumerosComplejos resta = ComplexMath.resta(a, b);
        NumerosComplejos division = ComplexMath.cociente(a, b);
        NumerosComplejos cartesianoPolar = ComplexMath.cartesianoPolar(a);
        NumerosComplejos polarCartesiano = ComplexMath.polarCartesiano(a);
        double modulo = a.modulo();
        NumerosComplejos conjugado = a.conjugado();

        System.out.println(suma.parteReal + " + " + "(" + suma.parteImaginaria + ")i");
        System.out.println(producto.parteReal + " + " + "(" + producto.parteImaginaria+ ")i");
        System.out.println(resta.parteReal + " + " + "(" + resta.parteImaginaria+ ")i");
        System.out.println(division.parteReal + " + " + "(" + division.parteImaginaria+ ")i");
        System.out.println(cartesianoPolar.parteReal + " + " + "(" + cartesianoPolar.parteImaginaria+ ")i");
        System.out.println(polarCartesiano.parteReal + " + " + "(" + polarCartesiano.parteImaginaria+ ")i");
        System.out.println(modulo);
        System.out.println(conjugado.parteReal + " + " + "(" + polarCartesiano.parteImaginaria+ ")i");
        
    }

}

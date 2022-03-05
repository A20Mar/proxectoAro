package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Marta
 */

public class Aro {
    /**
     * MINIMO variable pública que indica el valor mínimo del radio
     */
    public static final double MINIMO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;
/**
 * Constructor vacío
 */
    public Aro() {
        
    }
/**
 * Constructor con 3 parámetros
     * @param valorX int
     * @param valorY int
     * @param valorRadio double
 * coordenadaX=valorX
 * coordenadaY=valorX
 * setRadio(valorRadio)
 */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
        
    }





    private static final double LIMITERADIO = MINIMO;
/**
 * Método que devuelve el valor del radio
 * @return getRadio
 */
    public double obterRadio() {
        return getRadio();
    }
/**
 * Método que devuelve el valor del diámetro
 * @return getRadio*2
 */
    public double obterDiametro() {
        return getRadio() * 2;
    }
/**
 * Método que devuelve el valor de la circunferencia
 * @return el producto de PI*obterDiámetro
 */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }
/**
 * Método que devuelve el valor del área del círculo
 * @return el producto del PI*getRadio*getRadio
 */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }
/**
 * Método que suma un enero a la coordenadaX  y a la coordenadaY para trasladar el centro del cículo
 * @param trasladarX número entero
 * @param trasladarY número entero
 */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
       // return radio;
        return radio=(radio < LIMITERADIO ? LIMITERADIO : radio);
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
       
    }
}
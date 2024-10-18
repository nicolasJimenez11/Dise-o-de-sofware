package calcfiguras;
import java.lang.Math;

public  class Circulo extends Figura {
    private double radio;
    private double area;
    private double perimeter;

    public Circulo(double radio) {
        this.radio = radio;
    }
    protected double area() {
        return this.area;
    }
    protected double perimeter() {
        return this.perimeter;
    }
    public void CalcularArea() {
        this.area = Math.PI * Math.pow(this.radio, 2);
    }
    public void CalcularPerimetro() {
        this.perimeter = 2 * Math.PI * this.radio;
    }
}

package calcfiguras;

public class Triangulo extends Figura{

    private double lado1;
    private double lado2;
    private double lado3;
    private double area;
    private double perimeter;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    protected double area() {
        return this.area;
    }

    protected double perimeter() {
        return this.perimeter;
    }

    public double getPerimetro() {
        return super.getPerimetro();
    }

    public double getArea() {
        return super.getArea();
    }

    public void CalcularArea() {
        double s = (lado1 + lado2 + lado3) / 2.0;
        this.area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public void CalcularPerimetro() {
        this.perimeter = lado1 + lado2 + lado3;
    }
}

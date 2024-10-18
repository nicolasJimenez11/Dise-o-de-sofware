package calcfiguras;

public  class Main {

    public static void main( String [] args){
        Figura circulo1 = new Circulo(120);
        circulo1.CalcularArea();
        circulo1.CalcularPerimetro();
        System.out.println("Area del circulo: " + circulo1.getArea());
        System.out.println("Perimetro del circulo: " + circulo1.getPerimetro());

        Figura rectangulo1 = new Rectangulo(5, 10);
        rectangulo1.CalcularArea();
        rectangulo1.CalcularPerimetro();
        System.out.println("Area del rectangulo: " + rectangulo1.getArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo1.getPerimetro());

        Figura triangulo1 = new Triangulo(3, 4, 5);
        triangulo1.CalcularArea();
        triangulo1.CalcularPerimetro();
        System.out.println("Area del triangulo: " + triangulo1.getArea());
        System.out.println("Perimetro del triangulo: " + triangulo1.getPerimetro());



    }






}

package calcfiguras;

public abstract class  Figura {

    protected abstract double area();
    protected abstract  double perimeter();

    public double getPerimetro(){
        return perimeter();
}
    public double getArea(){
        return area();

    }

        public abstract  void  CalcularArea();
        public abstract  void  CalcularPerimetro();





    }

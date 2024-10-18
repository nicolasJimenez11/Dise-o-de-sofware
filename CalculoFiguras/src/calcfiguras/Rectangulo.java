package calcfiguras;

public class Rectangulo extends  Figura {
      private double base;
        private double altura;
        private double area;
        private double perimeter;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        protected double area() {
            return this.area;
        }

        protected double perimeter() {
            return this.perimeter;
        }

        public void CalcularArea() {
            this.area = base * altura;
        }

        public void CalcularPerimetro() {
            this.perimeter = 2 * (base + altura);
        }
    }

public class Rectangulo {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área
    public double area() {
        return base * altura;
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * (base + altura);
    }
}

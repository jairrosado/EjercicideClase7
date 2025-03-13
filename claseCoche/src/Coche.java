public class Coche {
    private String color;
    private String marca;
    private String modelo;
    private int caballos;
    private int numeroPuertas;
    private String matricula;

    // Constructor
    public Coche(String color, String marca, String modelo, int caballos, int numeroPuertas, String matricula) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
        this.numeroPuertas = numeroPuertas;
        this.matricula = matricula;
    }

    // Métodos para mostrar información del coche
    public void mostrarInfo() {
        System.out.println("Coche: " + marca + " " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Caballos: " + caballos);
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Matrícula: " + matricula);
    }
}

class PruebaCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Rojo", "Toyota", "Corolla", 120, 4, "ABC123");
        Coche coche2 = new Coche("Azul", "Ford", "Focus", 150, 5, "XYZ789");

        coche1.mostrarInfo();
        coche2.mostrarInfo();
    }
}

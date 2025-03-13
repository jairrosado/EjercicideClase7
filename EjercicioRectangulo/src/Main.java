import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura: ");
        double altura = sc.nextDouble();
        System.out.println("Ingrese la base: ");
        double base = sc.nextDouble();
        Rectangulo rect = new Rectangulo(base, altura);
        System.out.println("Área: " + rect.area());
        System.out.println("Perímetro: " + rect.perimetro());
        sc.close();




    }
}
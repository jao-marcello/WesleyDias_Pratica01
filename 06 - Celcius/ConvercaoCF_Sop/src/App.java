import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    Dados eq = new Dados();
    double f, c;

    System.out.println("Informe a temperatura atual em Celsius: ");
    eq.setC(input.nextDouble());

    f = eq.converteFah();

    System.out.println("A temperatura atua em Fahrenheit é: " + f + "º");
    }
}

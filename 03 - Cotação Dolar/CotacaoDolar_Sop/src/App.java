import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Dados eq = new Dados();
        double cotaDolar, dolar, reais;

        System.out.println("Qual o valor do dolar hoje? ");
        eq.setCotaDolar(input.nextDouble());
        System.out.println("Insira quantos dolares você tem atualmene: ");
        eq.setDolar(input.nextDouble());

        reais = eq.calculaDolar();

        System.out.println("O valor em Reais da sua quantidade de dolares são: R$" + reais);
    }
}

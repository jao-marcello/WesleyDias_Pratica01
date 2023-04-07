import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Dados eq = new Dados();
        double salario, novoSalario, reajuste;

        System.out.println("Insira seu salario atual para calcular o reajuste: ");
        eq.setSalario(input.nextDouble());

        novoSalario = eq.reajusteSalario();
        reajuste = eq.reajusteValor();

        System.out.println("Seu novo salario é: R$" + novoSalario + "\nO valor do reajuste do seu salario foi de: R$" + reajuste);





    }
}

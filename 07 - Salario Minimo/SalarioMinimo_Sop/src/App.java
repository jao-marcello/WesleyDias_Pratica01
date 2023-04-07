import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Dados eq = new Dados();
        int salMin, salFunc, quantSalar;

        System.out.println("Digite o salario minimo atualmente: ");
        eq.setSalMin(input.nextInt());

        System.out.println("Digite o salario atual de seu funcionario: ");
        eq.setSalFunc(input.nextInt());

        quantSalar = eq.calculaSalario();

        System.out.println("O seu funconario recebe " + quantSalar + " salarios minimos. ");
    }
}

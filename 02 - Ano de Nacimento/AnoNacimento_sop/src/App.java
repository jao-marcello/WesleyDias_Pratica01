import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Datas eq = new Datas();
        int anoNacimento, anoAtual, ano2050, idade, idade2050;

        System.out.println("Insira o seu ano de nacimento");
        eq.setAnoNacimento(input.nextInt());
        System.out.println("Insira o ano atual:");
        eq.setAnoAtual(input.nextInt());

        idade = eq.calculaIdade();
        idade2050 = eq.calculaIdade2050();

        System.out.println("Você tem " + idade + " anos de idade. \nEm 2050 você terá " + idade2050 + " anos de idade.");


    }
}

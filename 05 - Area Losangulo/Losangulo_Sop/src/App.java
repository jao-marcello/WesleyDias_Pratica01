import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Dados eq = new Dados();
        double diagMaior, diagMenor, area;

        System.out.println("insira o tamanho da diagonal maior: ");
        eq.setDiagMaior(input.nextDouble());

        System.out.println("Insira o tamanho da diagonal menor: ");
        eq.setDiagMenor(input.nextDouble());

        area = eq.calculaArea();

        System.out.println("O tamanho da area do logangulo é: " + area);

    
    }
}

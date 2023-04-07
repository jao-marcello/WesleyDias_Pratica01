import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Dados eq = new Dados();
        double peso, pesoMais, pesoMenos;

        System.out.println("Informe seu peso atual: ");
        eq.setPeso(input.nextDouble());

        pesoMais = eq.calculaMais();
        pesoMenos = eq.CalculaMenos();

        System.out.println("Caso você engorde 15%, seu novo peso sera: " + pesoMais + 
        "kg. \nCaso você emagreça 20%, seu novo peso sera: " + pesoMenos + "kg");

        
    }
}

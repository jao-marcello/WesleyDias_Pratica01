import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Dados eq = new Dados();
        double raio, comp, area, vol;

        System.out.println("Insira o tamanho do Raio de uma esfera: ");
        eq.setRaio(input.nextDouble());

        comp = eq.calculaComp();
        area = eq.calculaArea();
        vol = eq.calculaVol();

        System.out.println("O COMPRIMENTO da esfera é: " + comp + 
        "\nA AREA da esfera é : " + area + 
        "\nO VOLUME da esfrea é: " + vol);
    }
}

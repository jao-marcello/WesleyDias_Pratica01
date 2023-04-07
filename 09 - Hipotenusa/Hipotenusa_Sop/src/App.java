import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Dados eq = new Dados();
        double catetoMais, catetoMenos, hipotenusa;

        System.out.println("Insira o tamanho do maior cateto: ");
        eq.setCatetoMais(input.nextDouble());

        System.out.println("Insira o tamanho do menor cateto: ");
        eq.setCatetoMenos(input.nextDouble());

        hipotenusa = eq.calculaHipo();

        System.out.println("O tamanho da hipotenusa é: " + hipotenusa);
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Dados eq = new Dados();
        int n, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10;

        System.out.println("Insira um numero:");
        eq.setN(input.nextInt());
        n = eq.getN();
        

        x0 = eq.calX0();
        x1 = eq.calX1();
        x2 = eq.calX2();
        x3 = eq.calX3();
        x4 = eq.calX4();
        x5 = eq.calX5();
        x6 = eq.calX6();
        x7 = eq.calX7();
        x8 = eq.calX8();
        x9 = eq.calX9();
        x10 = eq.calX10();

        System.out.println( n + " X 0 = " + x0 +
        "\n" + n + " X 1 = " + x1 +
        "\n" + n + " X 2 = " + x2 +
        "\n" + n + " X 3 = " + x3 +
        "\n" + n + " X 4 = " + x4 +
        "\n" + n + " X 5 = " + x5 +
        "\n" + n + " X 6 = " + x6 + 
        "\n" + n + " X 7 = " + x7 +
        "\n" + n + " X 8 = " + x8 +
        "\n" + n + " X 9 = " + x9 +
        "\n" + n + " X 10 = " + x10);
    }
}

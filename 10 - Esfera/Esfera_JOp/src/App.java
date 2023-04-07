import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados();
        String entrada;
        double r, c, a, v;

        entrada = JOptionPane.showInputDialog("Insira o tamanho do RAIO da esfera:");
        r = Double.parseDouble(entrada);
        eq.setR(r); 

        c = eq.calculaComp();
        a = eq.calculaArea();
        v = eq.calculaVol();

        JOptionPane.showMessageDialog(null, "O COMPRIMENTO da esfera é: " + c +
        "\nA AREA da esfera é: " + a +
        "\nO VOLUME da espera é: " + v);


    }
}

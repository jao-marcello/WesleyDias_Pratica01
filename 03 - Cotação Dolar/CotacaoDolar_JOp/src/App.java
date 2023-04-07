import javax.swing.JOptionPane;
import javax.print.attribute.standard.JobHoldUntil;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados();
        String entrada;
        double cotaDolar, dolar, reais;

        entrada = JOptionPane.showInputDialog("Qual o valor do dolar hoje? ");
        cotaDolar = Double.parseDouble(entrada);
        eq.setCotaDolar(cotaDolar);

        entrada = JOptionPane.showInputDialog("Quantos dolares você tem atualmente? ");
        dolar = Double.parseDouble(entrada);
        eq.setDolar (dolar);

        reais = eq.calculaDolar();

        JOptionPane.showMessageDialog(null, "O valor em Reais da sua quantidade de dolares são: R$" + reais);

    }
}

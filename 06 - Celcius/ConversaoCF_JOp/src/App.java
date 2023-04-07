import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq =  new Dados();
        String entrada;
        double c, f;

        entrada = JOptionPane.showInputDialog(null, "Digite a temperatura em Celsius: ");
        c = Double.parseDouble(entrada);
        eq.setC(c);

        f = eq.converteCel();

        JOptionPane.showMessageDialog(null, "a temperatura em Fahrenheit é: " + f + "º");
    }
}

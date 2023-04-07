import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados();
        String entrada;
        double peso, pesoMais, pesoMenos;

        entrada = JOptionPane.showInputDialog("Digite o seu peso Atual: ");
        peso = Double.parseDouble(entrada);
        eq.setPeso(peso);

        pesoMais = eq.calculaMais();
        pesoMenos = eq.calculaMenos();

        JOptionPane.showMessageDialog(null, "Caso você engorde 15%, seu novo peso será: " + pesoMais + "kg.\nCaso você emagreça 20%, seu novo peso será: " + pesoMenos + "kg.");
    }
}

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados();
        String entrada;
        double area, diagoMaior, diagoMenor;

        entrada = JOptionPane.showInputDialog("Insira o tamanho da Diagonal maior do losangolo: ");
        diagoMaior = Double.parseDouble(entrada);
        eq.setDiagoMaior(diagoMaior);

        entrada = JOptionPane.showInputDialog("Insira o tamanho da diagonal menor do losangolo: ");
        diagoMenor = Double.parseDouble(entrada);
        eq.setDiagoMenor(diagoMenor);

        area = eq.calculaArea();

        JOptionPane.showMessageDialog(null, "O tamanho da area do losangolo é: " + area);


    }
}

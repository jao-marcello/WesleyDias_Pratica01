import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados();
        String entrada;
        double salario, novoSalario, reajuste;

        entrada = JOptionPane.showInputDialog("Informe seu salario atual para calcular o reajuste: ");
        salario = Double.parseDouble(entrada);
        eq.setSalario(salario);

        novoSalario = eq.reajusteSalario();
        reajuste = eq.reajusteValor();

        JOptionPane.showMessageDialog(null, "O seu novo salario é: R$" + novoSalario + "\nO valor do reajuste do seu salario foi de: R$" + reajuste);


      
    }
}

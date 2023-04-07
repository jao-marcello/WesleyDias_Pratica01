import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados();
        String entrada;
        int salMin, salFunc, salarios;

        entrada = JOptionPane.showInputDialog("Informe o salario minimo atual: ");
        salMin = Integer.parseInt(entrada);
        eq.setSalMin(salMin);

        entrada = JOptionPane.showInputDialog("Informe o salario atual de seu funcionario: ");
        salFunc = Integer.parseInt(entrada);
        eq.setSalFunc(salFunc);

        salarios = eq.calculaSal();

        JOptionPane.showMessageDialog(null, "Seu funcionario recebe " + salarios + " salarios minimos.");

        
    }
}

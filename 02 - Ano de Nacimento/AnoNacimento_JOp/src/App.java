import javax.swing.JOptionPane;
import javax.print.attribute.standard.JobHoldUntil;

public class App {
    public static void main(String[] args) throws Exception {
        Datas eq = new Datas();
        String entrada;
        int anoNacimento, anoAtual, ano2050, idade, idade2050;

        entrada = JOptionPane.showInputDialog("Insira seu ano de nacimento: ");
        anoNacimento = Integer.parseInt(entrada);
        eq.setAnoNacimento(anoNacimento);

        entrada = JOptionPane.showInputDialog("Insira o ano atual: ");
        anoAtual = Integer.parseInt(entrada);
        eq.setAnoAtual(anoAtual);

        idade = eq.calculaIdade();
        idade2050 = eq.calculaIdade2050();

        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos de idade. \nEm 2050 você terá " + idade2050 + " anos de idade." );
    }
}    


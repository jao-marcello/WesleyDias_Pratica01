import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados();
        String entrada;
        double catetoMais, catetoMenos, hipotenusa;

        entrada = JOptionPane.showInputDialog("Insira o tamanho do maior cateto: ");
        catetoMais = Double.parseDouble(entrada);
        eq.setCatetoMais(catetoMais);

        entrada = JOptionPane.showInputDialog("Insira o tamanho do menor cateto:");
        catetoMenos = Double.parseDouble(entrada);
        eq.setCatetoMenos(catetoMenos);

        hipotenusa = eq.calculaHipo();

        JOptionPane.showMessageDialog(null, "O tamanho da hipotenusa é: " + hipotenusa);


    }
}

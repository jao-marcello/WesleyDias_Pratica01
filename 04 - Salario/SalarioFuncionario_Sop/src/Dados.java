public class Dados {
    private double salario;
    private double novoSalario;
    private double reajuste;
    
    public double getReajuste() {
        return reajuste;
    }
    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getNovoSalario() {
        return novoSalario;
    }
    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

    public double reajusteSalario(){
        novoSalario = salario + ((salario * 25) /100);
        return novoSalario;
    }

    public double reajusteValor(){
        reajuste = (salario * 25) /100;
        return reajuste;
    }

    
}

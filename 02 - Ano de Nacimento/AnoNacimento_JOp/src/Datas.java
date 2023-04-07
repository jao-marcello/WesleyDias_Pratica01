public class Datas {
    private int anoNacimento;
    private int anoAtual;
    private int ano2050 = 2050;
    private int idade;
    private int idade2050;
 
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade2050() {
        return idade2050;
    }
    public void setIdade2050(int idade2050) {
        this.idade2050 = idade2050;
    }
    public int getAnoNacimento() {
        return anoNacimento;
    }
    public void setAnoNacimento(int anoNacimento) {
        this.anoNacimento = anoNacimento;
    }
    public int getAnoAtual() {
        return anoAtual;
    }
    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }


    public int calculaIdade (){
        idade = anoAtual - anoNacimento;
        return idade;
    }

    public int calculaIdade2050(){
        idade2050 = ano2050 - anoNacimento;
        return idade2050;
    }
    
}


public class Dados {
    private double peso;
    private double pesoMais;
    private double pesoMenos;
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPesoMais() {
        return pesoMais;
    }
    public void setPesoMais(double pesoMais) {
        this.pesoMais = pesoMais;
    }
    public double getPesoMenos() {
        return pesoMenos;
    }
    public void setPesoMenos(double pesoMenos) {
        this.pesoMenos = pesoMenos;
    }

    public double calculaMais(){
        pesoMais = peso + (peso * 0.15);
        return pesoMais;
    }
    
    public double calculaMenos(){
        pesoMenos = peso - (peso * 0.20);
        return pesoMenos;
    }
}

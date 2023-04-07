public class Dados {
    private double cotaDolar;
    private double dolar;
    private double reais;

    public double getCotaDolar() {
        return cotaDolar;
    }
    public void setCotaDolar(double cotaDolar) {
        this.cotaDolar = cotaDolar;
    }
    public double getDolar() {
        return dolar;
    }
    public void setDolar(double dolar) {
        this.dolar = dolar;
    }
    public double getReais() {
        return reais;
    }
    public void setReais(double reais) {
        this.reais = reais;
    }



    public double calculaDolar(){
        reais = cotaDolar * dolar;
        return reais;
    }

}

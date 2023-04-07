public class Dados {
    private int SalMin;
    private int salFunc;
    private int quantSalar;

        public int getSalMin() {
        return SalMin;
    }

    public void setSalMin(int salMin) {
        SalMin = salMin;
    }

    public int getSalFunc() {
        return salFunc;
    }

    public void setSalFunc(int salFunc) {
        this.salFunc = salFunc;
    }

    public int getQuantSalar() {
        return quantSalar;
    }

    public void setQuantSalar(int quantSalar) {
        this.quantSalar = quantSalar;
    }

    
    
    public int calculaSalario(){
        quantSalar = salFunc / SalMin;
        return quantSalar;
    }
}

public class Dados {
    private double catetoMais;
    private double catetoMenos;
    private double hipotenusa;
   
    public double getCatetoMais() {
        return catetoMais;
    }
    public void setCatetoMais(double catetoMais) {
        this.catetoMais = catetoMais;
    }
    public double getCatetoMenos() {
        return catetoMenos;
    }
    public void setCatetoMenos(double catetoMenos) {
        this.catetoMenos = catetoMenos;
    }
    public double getHipotenusa() {
        return hipotenusa;
    }
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    
    public double calculaHipo(){
        hipotenusa = Math.sqrt(Math.pow(catetoMenos, 2) + Math.pow(catetoMais, 2));
        return hipotenusa;
    }
}

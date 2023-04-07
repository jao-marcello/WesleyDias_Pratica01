public class Dados {
    private double raio;
    private double comp;
    private double area;
    private double vol;
    
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getComp() {
        return comp;
    }
    public void setComp(double comp) {
        this.comp = comp;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getVol() {
        return vol;
    }
    public void setVol(double vol) {
        this.vol = vol;
    }

    public double calculaComp(){
        comp = 2 * Math.PI * raio;
        return comp;
    }

    public double calculaArea(){
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    public double calculaVol(){
        vol = .75 * Math.PI * Math.pow(raio, 3);
        return vol;
    }
}

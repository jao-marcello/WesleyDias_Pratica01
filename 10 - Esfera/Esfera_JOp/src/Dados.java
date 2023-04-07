public class Dados {
    private double r;
    private double c;
    private double a;
    private double v;
    
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getV() {
        return v;
    }
    public void setV(double v) {
        this.v = v;
    }
    
    public double calculaComp(){
        c = 2 * Math.PI * r;
        return c;
    }
    public double calculaArea(){
        a = Math.PI * Math.pow(r, 2);
        return a;
    }
    public double calculaVol(){
        v = .75 * Math.PI * Math.pow(r, 3);
        return v;
    }
}

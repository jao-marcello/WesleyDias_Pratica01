public class Dados {
    private double c;
    private double f;
    
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getF() {
        return f;
    }
    public void setF(double f) {
        this.f = f;
    }
    public double converteFah(){
        f = (c * 1.8) + 32;
        return f;
    }
}

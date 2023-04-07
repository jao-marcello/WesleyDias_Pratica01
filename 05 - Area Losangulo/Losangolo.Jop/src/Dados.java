public class Dados {
    private double area;
    private double diagoMaior;
    private double diagoMenor;
    
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getDiagoMaior() {
        return diagoMaior;
    }
    public void setDiagoMaior(double diagoMaior) {
        this.diagoMaior = diagoMaior;
    }
    public double getDiagoMenor() {
        return diagoMenor;
    }
    public void setDiagoMenor(double diagoMenor) {
        this.diagoMenor = diagoMenor;
    }

    public double calculaArea(){
        area = (diagoMaior * diagoMenor) /2;
        return area;
    }
    
}

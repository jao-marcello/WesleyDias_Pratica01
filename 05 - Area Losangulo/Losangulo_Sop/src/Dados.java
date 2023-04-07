public class Dados {
    private double diagMaior;
    private double diagMenor;
    private double area;
    
    public double getDiagMaior() {
        return diagMaior;
    }
    public void setDiagMaior(double diagMaior) {
        this.diagMaior = diagMaior;
    }
    public double getDiagMenor() {
        return diagMenor;
    }
    public void setDiagMenor(double diagMenor) {
        this.diagMenor = diagMenor;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double calculaArea(){
        area = (diagMaior * diagMenor) /2;
        return area;
    }


    
}

public class Dados {
    private int salMin;
    private int salFunc;
    private int salarios;
    
    
    public int getSalMin() {
        return salMin;
    }
    public void setSalMin(int salMin) {
        this.salMin = salMin;
    }
    public int getSalFunc() {
        return salFunc;
    }
    public void setSalFunc(int salFunc) {
        this.salFunc = salFunc;
    }
    public int getSalarios() {
        return salarios;
    }
    public void setSalarios(int salarios) {
        salarios = salarios;
    }


    public int calculaSal(){
        salarios = salFunc / salMin;
        return salarios;
    }

    
    
}

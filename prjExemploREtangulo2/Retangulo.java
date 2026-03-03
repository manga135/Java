
/**
 *
 * @author Matheus Camargo
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double a){
        altura = a;
    }
    
    public double getAltura(){
        return(altura);
    }
    
    public double getBase(){
        return(base);
    }
    
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public double calcArea(){
        return(altura*base);
    }
    
    public double calcPerimetro(){
        return((altura*2)+(base*2));
    }
    
}

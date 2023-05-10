package figurasGeometricas;

public class Figura {
    private String color;
    
    /**
     * Prueba
     * @return 
     */
    public double calcularArea(){
        return 0.0;
    }
    
    public double calcularPerimetro(){
        return 0.0;
    }
    
    /**
     * numero correponde al radio en Circulo y al lado en Cuadrado
     * @param numero
     * @return 
     */
    public double calcularPerimetro(double numero){
        return 0.0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura{" + "color=" + color + '}';
    }
    
    
    
}

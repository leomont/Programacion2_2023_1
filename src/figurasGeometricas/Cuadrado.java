package figurasGeometricas;
public class Cuadrado extends Figura{

    private double alto;
    private double ancho;

    public Cuadrado(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularPerimetro() {
        return (this.alto + this.alto + this.ancho + this.ancho) ;
    }

    @Override
    public double calcularArea() {
        return (this.alto * this.ancho);
    }

    
    
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "alto=" + alto + ", ancho=" + ancho + '}';
    }
    
    
    
}

package figurasGeometricas;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * 3.1416 * this.radio);
    }

    @Override
    public double calcularPerimetro(double numero) {
        return (2 * 3.1416 * numero);
    }

    @Override
    public double calcularArea() {
        return (3.1416 * this.radio*this.radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
}

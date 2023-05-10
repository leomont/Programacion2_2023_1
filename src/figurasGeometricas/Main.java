package figurasGeometricas;
public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(5, 5);
        
        System.out.println("El area del circulo es: "+ circulo.calcularArea());
        System.out.println("El area del cuadrado es: "+cuadrado.calcularArea());
        
        Figura figura = new Circulo(5);
        
        // Object figura = new Circulo(5);
        // Circulo circuloUno = (Circulo) figura;
        Circulo circuloUno = (Circulo) figura;
        
    }
}

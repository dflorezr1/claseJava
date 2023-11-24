package paquete;

public class Rectangulo extends Figura{
	private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Rectángulo - Lado 1: " + lado1 + ", Lado 2: " + lado2);
    }
}

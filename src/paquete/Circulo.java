package paquete;

public class Circulo extends Figura {

	private double radio;
	
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Círculo - Radio: " + radio);
    }

}

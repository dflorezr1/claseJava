package paquete;

public class MainAbstract {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        circulo.imprimirDetalles();
        rectangulo.imprimirDetalles();
	}

}

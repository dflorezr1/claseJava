package libreto;

public class Libro implements Prestable {
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private boolean prestado;

	public Libro(String titulo, String autor, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.prestado = false;
	}

	@Override
	public void prestar() {
		if (!prestado) {
			prestado = true;
			System.out.println("Libro prestado: " + titulo);
		} else {
			System.out.println("El libro ya está prestado");
		}
	}

	@Override
	public void devolver() {
		if (prestado) {
			prestado = false;
			System.out.println("Libro devuelto: " + titulo);
		} else {
			System.out.println("El libro no estaba prestado");
		}
	}

	@Override
	public String toString() {
		return "Libro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", anioPublicacion="
				+ anioPublicacion + ", prestado=" + prestado + '}';
	}
}

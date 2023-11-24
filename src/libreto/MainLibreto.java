package libreto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainLibreto {

	public static void main(String[] args) {
		List<Libro> listaLibros = new ArrayList<>();
		listaLibros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954));
		listaLibros.add(new Libro("1984", "George Orwell", 1949));
		listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
		for (Libro libro : listaLibros) {
			System.out.println(libro);
		}

		List<Estudiante> listaEstudiantes = new ArrayList<>();
		listaEstudiantes.add(new Estudiante("Juan", 20, 8.5));
		listaEstudiantes.add(new Estudiante("María", 22, 9.2));
		listaEstudiantes.add(new Estudiante("Pedro", 21, 7.8));
		Collections.sort(listaEstudiantes);
		for (Estudiante estudiante : listaEstudiantes) {
			System.out.println(estudiante);
		}

		for (Libro libro : listaLibros) {
			libro.prestar();
			System.out.println(libro.toString());
			libro.devolver();
			System.out.println(libro.toString());
			System.out.println();
		}

	}

}

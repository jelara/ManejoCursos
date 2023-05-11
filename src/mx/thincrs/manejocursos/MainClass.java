package mx.thincrs.manejocursos;

public class MainClass {

	public static void main() {
		Curso curso = new Curso("Test", null, null);

		try {
			curso.setNombre("Java");
		} catch (Exception e) {
			System.out.println("Error al cambiar el nombre del curso" + e.getMessage());
		}
	}
}

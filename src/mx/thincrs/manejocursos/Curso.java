package mx.thincrs.manejocursos;

public class Curso {
	private String nombre;
	private Estudiante[] estudiantes;
	private Reto[] retos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == "")
			throw new Error();
		this.nombre = nombre;
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Reto[] getRetos() {
		return retos;
	}

	public void setRetos(Reto[] retos) {
		this.retos = retos;
	}

	public Curso(String nombre, Estudiante[] estudiantes, Reto[] retos) {
		super();
		if (nombre == "")
			throw new Error();
		this.nombre = nombre;
		this.estudiantes = estudiantes;
		this.retos = retos;
	}
}

package mx.thincrs.manejocursos;

public class Estudiante {
	private String nombre;
	private Evaluacion[] evaluaciones;

	public int calcularPromedio() {
		int sumaEvaluaciones = 0;
		
		for(int i = 0; i < evaluaciones.length; i++)
			sumaEvaluaciones += evaluaciones[i].getNota();
		
		return sumaEvaluaciones / evaluaciones.length;
	}

	public Evaluacion[] getEvaluaciones() {
		return evaluaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setEvaluaciones(Evaluacion[] evaluaciones) {
		this.evaluaciones = evaluaciones;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

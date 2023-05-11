package mx.thincrs.manejocursos;

public class Evaluacion {
	private Reto reto;
	private int nota;
	
	public Evaluacion() {
		super();
		this.reto = null;
		this.nota = 0;
	}
	
	public Evaluacion(Reto reto, int nota) {
		super();
		this.reto = reto;
		this.nota = nota;
	}
	public int getNota() {
		return nota;
	}
	public Reto getReto() {
		return reto;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public void setReto(Reto reto) {
		this.reto = reto;
	}
}

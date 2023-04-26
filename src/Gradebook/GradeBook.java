package Gradebook;

public class GradeBook {
	
	
	private String nombreCurso;
	private int aforo;
	
	
	/**
	 * 
	 */
	public GradeBook() {
		}

	/**
	 * @param nombreCurso
	 * @param aforo
	 */
	public GradeBook(String nombreCurso, int aforo) {
		this.nombreCurso = nombreCurso;
		this.aforo = aforo;
	}

	/**
	 * @param nombreCurso
	 */
	public GradeBook(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	/**
	 * @return the nombreCurso
	 */
	public String getNombreCurso() {
		return nombreCurso;
	}

	/**
	 * @param nombreCurso the nombreCurso to set
	 */
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public void displayMessage() {
		System.out.println("Bienvenido al sistema de Notas: " + getNombreCurso());
	}
	
	public void determineClassAverage() {
		
	}

}

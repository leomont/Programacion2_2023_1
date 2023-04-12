package Gradebook;

public class GradeBook {
	
	
	private String nombreCurso;
	
	
	
	
	
	
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






	public void displayMessage() {
		System.out.println("Bienvenido al sistema de Notas: " + getNombreCurso());
	}

}

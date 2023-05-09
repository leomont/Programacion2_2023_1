package Gradebook;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		GradeBook planillaNotasCurso1 = new GradeBook();
	
		GradeBook planillaNotasCurso2 = new GradeBook("Curso2");
		
		GradeBook planillaNotasCurso3 = new GradeBook("Curso3", 20);
				
		
		
		System.out.println("Escriba el nombre del curso");
		String nombreCurso = lector.nextLine();
		
		planillaNotasCurso1.setNombreCurso(nombreCurso);
		
		planillaNotasCurso1.displayMessage();
		
		planillaNotasCurso2.displayMessage();
		
		planillaNotasCurso3.displayMessage();
		
		System.out.println("Numero de estudiantes del curso: "+ planillaNotasCurso3.getNombreCurso() + " Aforo: " +planillaNotasCurso3.getAforo());
		
		planillaNotasCurso3.determineClassAverage();
	
	
	}

}

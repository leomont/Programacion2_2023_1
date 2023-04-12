package Gradebook;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		GradeBook planillaNotas = new GradeBook();
		
		System.out.println("Escriba el nombre del curso");
		String nombreCurso = lector.nextLine();
		
		planillaNotas.setNombreCurso(nombreCurso);
		
		planillaNotas.displayMessage();
	}

}

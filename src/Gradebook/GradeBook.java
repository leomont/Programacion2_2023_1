package Gradebook;

import java.util.Scanner;

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
		Scanner input = new  Scanner(System.in);
		
		int total;
		int gradeCounter;
		int grade;
		int average;
		
		total = 0 ;
		gradeCounter = 1;
		
		while (gradeCounter <= 8) {
			System.out.println("Ingrese la nota");
			grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter +1;
		}
		
		average = total /8;
		System.out.println("Total de las notas Sumatoria: " + total);
		System.out.println("Promedio: " + average );		
	}

}

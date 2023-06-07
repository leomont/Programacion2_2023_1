package com.programacion2.proyecto.fintech.businesslogic;

public class administrador extends persona {
	
	boolean esActivo;
	
	

	/**
	 * @return the esActivo
	 */
	public boolean isEsActivo() {
		return esActivo;
	}



	/**
	 * @param esActivo the esActivo to set
	 */
	public void setEsActivo(boolean esActivo) {
		this.esActivo = esActivo;
	}



	public administrador() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param correoElectronico
	 * @param cedula
	 * @param direccionResidencia
	 * @param direccionCorrespondencia
	 * @param recibirNotificaciones
	 * @param esActivo
	 */
	public administrador(String nombre, String apellidos, String fechaNacimiento, String correoElectronico,
			String cedula, String direccionResidencia, String direccionCorrespondencia, Boolean recibirNotificaciones,
			boolean esActivo) {
		super(nombre, apellidos, fechaNacimiento, correoElectronico, cedula, direccionResidencia,
				direccionCorrespondencia, recibirNotificaciones);
		this.esActivo = esActivo;
	}
	
	public administrador crearAdministrador(String nombre, String apellidos, String fechaNacimiento, String correoElectronico,
			String cedula, String direccionResidencia, String direccionCorrespondencia, Boolean recibirNotificaciones,
			boolean esActivo) {
		
		return new administrador(nombre, apellidos, fechaNacimiento, correoElectronico, cedula, direccionResidencia, direccionCorrespondencia, recibirNotificaciones, esActivo);
	}
	
	public administrador ActualizarAdministrador(String cedula) {
		
		return new administrador();
		
		//TODO: Implementar metodo que busque con la cedula del admin y retorne todos los datos de este objeto
		//return new administrador(nombre, apellidos, fechaNacimiento, correoElectronico, cedula, direccionResidencia, direccionCorrespondencia, recibirNotificaciones, esActivo);
	}
	
	
	
	
	

}

package com.programacion2.proyecto.fintech;

public class persona {
	
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String correoElectronico;
	private String cedula;
	private String direccionResidencia;
	private String direccionCorrespondencia;
	private Boolean recibirNotificaciones;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the direccionResidencia
	 */
	public String getDireccionResidencia() {
		return direccionResidencia;
	}

	/**
	 * @param direccionResidencia the direccionResidencia to set
	 */
	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}

	/**
	 * @return the direccionCorrespondencia
	 */
	public String getDireccionCorrespondencia() {
		return direccionCorrespondencia;
	}

	/**
	 * @param direccionCorrespondencia the direccionCorrespondencia to set
	 */
	public void setDireccionCorrespondencia(String direccionCorrespondencia) {
		this.direccionCorrespondencia = direccionCorrespondencia;
	}

	/**
	 * @return the recibirNotificaciones
	 */
	public Boolean getRecibirNotificaciones() {
		return recibirNotificaciones;
	}

	/**
	 * @param recibirNotificaciones the recibirNotificaciones to set
	 */
	public void setRecibirNotificaciones(Boolean recibirNotificaciones) {
		this.recibirNotificaciones = recibirNotificaciones;
	}

	public persona() {
		// TODO Auto-generated constructor stub
	}

}

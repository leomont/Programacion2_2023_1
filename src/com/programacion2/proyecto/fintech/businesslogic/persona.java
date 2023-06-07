package com.programacion2.proyecto.fintech.businesslogic;

public class persona {
	
	private String cedula;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String correoElectronico;
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
	 * @param cedula
	 * @param nombre
	 * @param apellidos
	 * @param correoElectronico
	 * @param direccionResidencia
	 * @param direccionCorrespondencia
	 */
	public persona(String cedula, String nombre, String apellidos, String correoElectronico, String direccionResidencia,
			String direccionCorrespondencia) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correoElectronico = correoElectronico;
		this.direccionResidencia = direccionResidencia;
		this.direccionCorrespondencia = direccionCorrespondencia;
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
	 */
	public persona(String nombre, String apellidos, String fechaNacimiento, String correoElectronico, String cedula,
			String direccionResidencia, String direccionCorrespondencia, Boolean recibirNotificaciones) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.correoElectronico = correoElectronico;
		this.cedula = cedula;
		this.direccionResidencia = direccionResidencia;
		this.direccionCorrespondencia = direccionCorrespondencia;
		this.recibirNotificaciones = recibirNotificaciones;
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

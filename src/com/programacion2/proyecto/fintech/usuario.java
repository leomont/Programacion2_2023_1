package com.programacion2.proyecto.fintech;

public class usuario extends persona {

	public usuario (){
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
	 */
	public usuario(String nombre, String apellidos, String fechaNacimiento, String correoElectronico, String cedula,
			String direccionResidencia, String direccionCorrespondencia, Boolean recibirNotificaciones) {
		super(nombre, apellidos, fechaNacimiento, correoElectronico, cedula, direccionResidencia, direccionCorrespondencia,
				recibirNotificaciones);
		// TODO Auto-generated constructor stub
	}
	
	public String agregarSaldo(float nuevoSaldo) {
		String resultadoOperacion = "";
		
		cuenta nuevaCuenta = new cuenta("0001", 2000);
		
		nuevaCuenta.setSaldo(nuevaCuenta.getSaldo() + nuevoSaldo); 
		
		resultadoOperacion = "Saldo consignado Satisfactoriamente";
		
		return resultadoOperacion;
	}

}

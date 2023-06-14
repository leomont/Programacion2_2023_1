package com.programacion2.proyecto.fintech.businesslogic;

import java.util.ArrayList;
import java.util.Iterator;

public class usuario extends persona {

	public usuario (){
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param cedula
	 * @param nombre
	 * @param apellidos
	 * @param correoElectronico
	 * @param direccionResidencia
	 * @param direccionCorrespondencia
	 */
	public usuario(String cedula, String nombre, String apellidos, String correoElectronico, String direccionResidencia,
			String direccionCorrespondencia) {
		super(cedula, nombre, apellidos, correoElectronico, direccionResidencia, direccionCorrespondencia);
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
	
	
	public usuario crearNuevoCliente(String nombre, String apellidos, String fechaNacimiento, String correoElectronico, String cedula,
			String direccionResidencia, String direccionCorrespondencia, Boolean recibirNotificaciones) {
		
		return new usuario(nombre, apellidos, fechaNacimiento, correoElectronico, cedula, direccionResidencia, direccionCorrespondencia, recibirNotificaciones);
		
	}
	
	public String crearNuevoClienteSinNotificaciones(String cedula, String nombre, String apellidos,  String correoElectronico, 
			String direccionResidencia, String direccionCorrespondencia) {
		
		new usuario(cedula, nombre, apellidos, correoElectronico, direccionResidencia, direccionCorrespondencia);
		
		return "Ingreso OK " + nombre;
		
	}
	
	@Override
	public String toString() {
		return "usuario [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getFechaNacimiento()="
				+ getFechaNacimiento() + ", getCorreoElectronico()=" + getCorreoElectronico() + ", getCedula()="
				+ getCedula() + ", getDireccionResidencia()=" + getDireccionResidencia()
				+ ", getDireccionCorrespondencia()=" + getDireccionCorrespondencia() + ", getRecibirNotificaciones()="
				+ getRecibirNotificaciones() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}



	public String eliminarCliente(String cedula) {
		
		//TODO: Implementar un metodo que busque el cliente con la cedula y elimine el registro 
		//p.ej:
		//ArrayList<String> demo = new ArrayList<String>();
		//demo.remove(0)
		
		ArrayList<usuario> listadoClientes = new ArrayList<usuario>();
		
		usuario usuariobuscado = listadoClientes.get(0);
		
		listadoClientes.remove(0);
		
		boolean fueEliminado = false;
		
		if (fueEliminado) {
			return "El cliente fue eliminado correctamente";
			
		}else
		{
			return "El cliente fue no encontrado correctamente";
			
		}
			
	}
	
	public usuario consultarCliente(String cedula) {
		//TODO: 1. Implemente un metodo que busque con el # cedula
		//p.ej:
		ArrayList<usuario> demo = new ArrayList<usuario>();
		usuario user1 = demo.get(0);
		
	
		
		return new usuario();
	}
	
	
	public usuario editarCliente(String cedula){
		
		//TODO: 1. Implemente un metodo que busque con el # cedula ver consultarCliente
		//p.ej:
		ArrayList<usuario> demo = new ArrayList<usuario>();
		usuario user1 = demo.get(0);
	
		
		//TODO: 2. asignar al cliente el dato que quiero modificar
		user1.setCorreoElectronico(cedula);
		
		
		//TODO: 3.agregar el usuario modificado a la lista.
		demo.add(user1);
		
		
	
		
		
		return new usuario();
	}
	
	
	public String agregarSaldo(float nuevoSaldo) {
		String resultadoOperacion = "";
		
		//cuenta nuevaCuenta = new cuenta("0001", 2000);
		
		//nuevaCuenta.setSaldo(nuevaCuenta.getSaldo() + nuevoSaldo); 
		
		resultadoOperacion = "Saldo consignado Satisfactoriamente";
		
		return resultadoOperacion;
	}
	
	public void listarUsuarios() {
		ArrayList<usuario> demo = new ArrayList<usuario>();
		usuario user1 = demo.get(0);
		
		for (usuario usuario : demo) {
			usuario.toString();
		}
	
	}

}

package com.programacion2.proyecto.fintech.businesslogic;

public class cuenta {

	
	private String cedula = "";
	private String tipoCuenta = ""; //Ahorros, Corriente, Credito
	private String numeroCuenta = "";
	private float saldo = 0;
	
	

	/**
	 * @param cedula
	 * @param tipoCuenta
	 */
	public cuenta(String cedula, String tipoCuenta) {
		this.cedula = cedula;
		this.tipoCuenta = tipoCuenta;
	}



	/**
	 * @param cedula
	 * @param tipoCuenta
	 * @param saldo
	 */
	public cuenta(String cedula, String tipoCuenta, float saldo) {
		this.cedula = cedula;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
	}



	/**
	 * @param cedula
	 * @param tipoCuenta
	 * @param numeroCuenta
	 * @param saldo
	 */
	public cuenta(String cedula, String tipoCuenta, String numeroCuenta, float saldo) {
		this.cedula = cedula;
		this.tipoCuenta = tipoCuenta;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}



	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
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
	 * @return the tipoCuenta
	 */
	public String getTipoCuenta() {
		return tipoCuenta;
	}



	/**
	 * @param tipoCuenta the tipoCuenta to set
	 */
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}



	/**
	 * @return the saldo
	 */
	public float getSaldo() {
		return saldo;
	}


	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public cuenta() {
		
		// TODO Auto-generated constructor stub
	}
	
	public void consignar() {
		
	}
	
	public void retirar() {
		
	}
	
	public void depositar() {
		
	}
	 
	public void verMovimientos() {
		
	}
	
	public void cobrarComision() {
		
	}
	
	

}

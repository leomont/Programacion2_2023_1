package com.programacion2.proyecto.fintech;

public class cuenta {

	private String numeroCuenta = "";
	private float saldo = 0;
	
	
	/**
	 * @param numeroCuenta
	 * @param saldo
	 */
	public cuenta(String numeroCuenta, float saldo) {
		super();
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

}

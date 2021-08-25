package com.curso.aeropuerto.dominio;

public class Superman extends Kriptoniano implements ObjetoVolador {

	@Override
	public void despegar() {
		System.out.println("Despegar superman");

	}

	@Override
	public void aterrizar() {
		System.out.println("Aterrizar superman");
	}

	@Override
	public void volar() {

		System.out.println("Volando superman");
	}

	@Override
	public void comer() {
		System.out.println("Comiendo superman");
		
	}

}

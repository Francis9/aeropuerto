package com.curso.aeropuerto.dominio;

public class Ave extends Animal implements ObjetoVolador {

	@Override
	public void despegar() {
		System.out.println("Despega el ave");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterriza el ave");

	}

	@Override
	public void volar() {
		System.out.println("Esta volando el ave");

	}

	public void hacerNido() {

		System.out.println("Hace un nido");
	}

	public void ponerHuevos() {

		System.out.println("Pone Huevos el Ave");
	}

	@Override
	public void comer() {
		System.out.println("Comiendo el Ave");
		
	}

	
	
}

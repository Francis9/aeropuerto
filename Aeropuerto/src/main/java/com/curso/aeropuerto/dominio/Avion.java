package com.curso.aeropuerto.dominio;

public class Avion implements ObjetoVolador{

	@Override
	public void despegar() {
		System.out.println("Despega un avion");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterriza un avion");
	}

	@Override
	public void volar() {
		System.out.println("Volando un avion");
	}

	
	
	
}

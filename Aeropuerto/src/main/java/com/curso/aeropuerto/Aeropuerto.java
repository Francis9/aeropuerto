package com.curso.aeropuerto;

import com.curso.aeropuerto.dominio.Animal;
import com.curso.aeropuerto.dominio.Ave;
import com.curso.aeropuerto.dominio.Avion;
import com.curso.aeropuerto.dominio.ObjetoVolador;
import com.curso.aeropuerto.dominio.Superman;

public class Aeropuerto {
	public static void main(String[] args) {

		Ave ave = new Ave();
		Avion avion = new Avion();
		Superman superman = new Superman();
		
		
		Aeropuerto aeropuerto = new Aeropuerto();

		aeropuerto.darPermisoAterrizar(ave);
		aeropuerto.darPermisoAterrizar(avion);
		aeropuerto.darPermisoAterrizar(superman);
		ave.comer();
		ave.ponerHuevos();
		ave.hacerNido();
		superman.comer();
		
	}

	private void darPermisoAterrizar(ObjetoVolador v) {
		v.aterrizar();
		v.despegar();
		v.volar();
		
		
	}
}
package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona {

	public boolean insertar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("insertando persona en la bdd " + persona);
		return true;
	}

	public boolean actualizar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("actualizando persona en la bdd "+ persona);
		return true;
	}

	public boolean eliminar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("eliminando persona en la bdd " + persona);
		return true;
	}

}

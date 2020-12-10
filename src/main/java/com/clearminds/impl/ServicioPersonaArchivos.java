package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona {

	public boolean insertar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("insertando persona en un archivo " + persona);
		return true;
	}

	public boolean actualizar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("actualizando persona en un archivo "+ persona);
		return true;
	}

	public boolean eliminar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("eliminando persona en un archivo " + persona);
		return true;
	}


}

package com.clearminds.impl;

import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonaManager personaManager = new PersonaManager();

		personaManager.insertarPersona(new Persona("Guisela", "Fernandez", 25));
		

	}

}

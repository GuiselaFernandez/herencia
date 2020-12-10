package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonaManager personaManager = null;
		try {
			personaManager = new PersonaManager();
		} catch (InstanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		personaManager.insertarPersona(new Persona("Guisela", "Fernandez", 25));
		

	}

}

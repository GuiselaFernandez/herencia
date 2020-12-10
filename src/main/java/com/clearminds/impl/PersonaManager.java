package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	public ServicioPersona serv;

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}
	
	public PersonaManager() throws InstanceException{
		Class<?> clase;
		try {
			clase = Class.forName("com.clearminds.impl.ServicioPersonaBDD");
			this.serv=(ServicioPersona)clase.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	 
	
	public void	insertarPersona(Persona persona) {
		
		serv.insertar(persona);
		
	}
	

}

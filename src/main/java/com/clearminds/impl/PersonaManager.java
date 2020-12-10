package com.clearminds.impl;

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
	
	public PersonaManager(){
		this.serv = new ServicioPersonaBDD();		
		
	}
	 
	
	public void	insertarPersona(Persona persona) {
		serv.insertar(persona);
		
	}
	

}

package curso.jee.action;


import com.opensymphony.xwork2.ActionSupport;

import curso.jee.model.Persona;


public class FormularioAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Persona persona;

	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}

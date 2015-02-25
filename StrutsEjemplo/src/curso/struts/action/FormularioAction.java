package curso.struts.action;

import com.opensymphony.xwork2.ActionSupport;

import curso.struts.model.Persona;

public class FormularioAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Persona persona;

	public String execute() throws Exception {
		persona = new Persona();
		return SUCCESS;
	}
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}

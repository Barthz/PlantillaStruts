package curso.jee.model.conversores;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import curso.jee.model.Persona;

public class ConversorPersona extends StrutsTypeConverter {

	@Override
	/**
	 * el Map es el Action Context
	 */
	public Object convertFromString(Map arg0, String[] values, Class arg2) {
		// TODO Auto-generated method stub
		Persona persona = null;
		if("curso.jee.model.Persona".equals(arg2.getName()))		
			persona = new Persona(Integer.parseInt(values[1]), values[0].toString());
		return persona;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		Persona persona = (Persona)arg1;
		String nombre = persona.getNombre();
		String edad = String.valueOf(persona.getEdad());
		return nombre + " " + edad;
	}

}

package curso.jee.action;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

import curso.jee.model.Persona;


public class FormularioAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Necesario para setear los atributos del form
	 */
	private Persona persona;

	/** Para el uso del fileupload interceptor, son necesarios estos 3 atributos
	 * ContentType y Filename usarán como prefijo el nombre del archivo myFile
	 * obligatoriamente
	 */
	private File myFile;
	private String myFileContentType;
	private String myFileFileName;

	/**
	 * Directorio donde vamos a guardar realmente el fichero subido
	 * definido como parámetro del action
	 */
	private String directorio;
	
	private String apellido;
	
	/**
	 * Siendo un tipo primitivo, este valor queda seteado como un entero automáticamente
	 * pese a venir en tipo String del formulario JSP. Esta es una característica de 
	 * struts llamada Type conversion
	 */
	private int edadMaxima;
	
	public String execute() throws Exception {
		System.out.println("Ejecuto FormularioAction");
		try {
			
			File outFile = new File(directorio + myFileFileName);
			

			FileInputStream in = new FileInputStream(myFile);
			FileOutputStream out = new FileOutputStream(outFile);

			int c;
			while( (c = in.read() ) != -1)
				out.write(c);

			in.close();
			out.close();
			System.out.println("FECHA: " + persona.getFecha());
		} catch(Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	/**
	 * Método del que se sirve el interceptor validation que valida una condición
	 * edadMaxima tendrá valor en cuanto que el interceptor param haya sido llamado
	 * antes que el interceptor validation. En la default-stack es así.
	 * los valores añadidos a ActionMessage y ActionError serán recogidos
	 * por el interceptor workflow, posterior a ambos
	 */
	public void validate(){
		if(edadMaxima > persona.getEdad()){
			addActionMessage("Persona valida");
		}else{
			addActionError("Error! Eres un viejuno");
		}	
	}
	
	public Persona getPersona() {
		return persona;
	}

	//Aqui iría la anotación para la conversión de tipos
	@TypeConversion(converter="curso.jee.model.conversores.ConversorPersona")
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdadMaxima() {
		return edadMaxima;
	}

	public void setEdadMaxima(int edadMaxima) {
		this.edadMaxima = edadMaxima;
	}

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getDirectorio() {
		return directorio;
	}

	public void setDirectorio(String directorio) {
		this.directorio = directorio;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
	
}

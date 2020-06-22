package Modelo;

import java.util.Calendar;
import java.util.ArrayList;


public class Medico extends Persona{

	private String especialidad;
	private String horario;
	
	public Medico(	String nombre,
					String apellidoPaterno,
					String apellidoMaterno,
					String domicilio,
					ArrayList<String> telefonos,
					Calendar nacimiento,
					//Atributos del médico
					String especialiad,
					String horario
				){
		super(nombre, apellidoPaterno, apellidoMaterno, domicilio, telefonos, nacimiento);
		this.especialidad=especialiad;
		this.horario=horario;
	}
	
	public void emiteDiagnostico(){}
	public void preescribeReceta(){}
	
}

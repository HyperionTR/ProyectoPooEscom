package Modelo;

import java.util.Calendar;
import java.util.ArrayList;


public class Paciente extends Persona{

	private String CURP;
	private String claveSeguro;
	private HistorialClinico historial;
	private ArrayList<Cita> citas;
	
	//Iniciando con los atributos de persona
	public Paciente(String nombre,
					String apellidoPaterno,
					String apellidoMaterno,
					String domicilio,
					ArrayList<String> telefonos,
					Calendar nacimiento,
					//Atributos del paciente
					String curp, 
					String seguro, 
					HistorialClinico 
					historial,
					Cita citas){
		super(nombre, apellidoPaterno, apellidoMaterno, domicilio, telefonos, nacimiento);
		this.CURP=curp;
		this.claveSeguro=seguro;
		this.historial=historial;
		this.citas=citas;
	}
	
}

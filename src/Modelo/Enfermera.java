package Modelo;

import java.util.Calendar;
import java.util.ArrayList;

public class Enfermera extends Persona{

	private String claveAcceso;
	
	public Enfermera(	String nombre,
						String apellidoPaterno,
						String apellidoMaterno,
						String domicilio,
						ArrayList<String> telefonos,
						Calendar nacimiento,
						//Atributos de Enfermera
						String claveAcceso){
		super(nombre, apellidoPaterno, apellidoMaterno, domicilio, telefonos, nacimiento);
		this.claveAcceso=claveAcceso;
	}
	
	private void registrarPaciente(ArrayList<String> datos){}
	private void registrarHistorial(Paciente pac){}
	
	//Métodos agregados
	private void registrarCita(Paciente paciente,Medico medico,Calendar fecha, int hora){}
	
}

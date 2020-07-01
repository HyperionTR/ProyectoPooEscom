package Modelo;

import java.util.Calendar;

import Controlador.Factory;

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
	
	
	public void registrarPaciente(String nombre,
			String apellidoPaterno,
			String apellidoMaterno,
			String domicilio,
			ArrayList<String> telefonos,
			Calendar nacimiento,
			//Atributos del paciente
			String curp, 
			String seguro){
		Factory.crearPaciente(nombre, apellidoPaterno, apellidoMaterno, domicilio, telefonos, nacimiento, curp, seguro, null);
		registrarHistorial(Factory.getPacientes().get(curp));
	}
	public void registrarHistorial(Paciente pac){
		//Este historial clínico se obtendrá de algun atributo de alguna interfáz gráfica
		HistorialClinico historial= Factory.getHistoriales().get(0);//Momentary fix
		
		pac.setHistorial(historial);
	}
	
	//Métodos agregados
	public void registrarCita(Paciente paciente,Medico medico,Calendar fecha, int hora){
		Factory.crearCita(fecha, hora, paciente, medico);
	}
	
	public String getClaveAcceso(){return claveAcceso;}
	
}

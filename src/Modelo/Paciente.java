package Modelo;

import java.util.Calendar;
import java.util.ArrayList;


public class Paciente extends Persona{

	private String CURP;
	private String claveSeguro;
	private HistorialClinico historial;
	
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
					historial){
		super(nombre, apellidoPaterno, apellidoMaterno, domicilio, telefonos, nacimiento);
		this.setCURP(curp);
		this.setClaveSeguro(seguro);
		this.setHistorial(historial);
	}

	public String getCURP() {
		return CURP;
	}

	public void setCURP(String cURP) {
		CURP = cURP;
	}

	public String getClaveSeguro() {
		return claveSeguro;
	}

	public void setClaveSeguro(String claveSeguro) {
		this.claveSeguro = claveSeguro;
	}

	public HistorialClinico getHistorial() {
		return historial;
	}

	public void setHistorial(HistorialClinico historial) {
		this.historial = historial;
	}
	
}

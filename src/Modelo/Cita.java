package Modelo;

import java.util.Calendar;

public class Cita {

	private Calendar fecha;
	private int hora;
	private Paciente paciente;
	private Medico medico;

	public Cita(Calendar fecha,
				int hora,
				Paciente paciente,
				Medico medico){
		this.fecha=fecha;
		this.hora=hora;
		this.paciente=paciente;
		this.medico=medico;
	}
	
	
}

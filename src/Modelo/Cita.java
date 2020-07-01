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
		this.setFecha(fecha);
		this.setHora(hora);
		this.setPaciente(paciente);
		this.setMedico(medico);
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
}

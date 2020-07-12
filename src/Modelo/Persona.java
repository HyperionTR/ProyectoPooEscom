package Modelo;

import java.util.Calendar;
import java.util.ArrayList;

public abstract class Persona {
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Calendar fechaNacimiento;
	private String domicilio;
	private ArrayList<String> telefonos;
	
	public Persona(	String nombre,
					String apellidoPaterno,
					String apellidoMaterno,
					String domicilio,
					ArrayList<String> telefonos,
					Calendar nacimiento){
		this.nombre=nombre;
		this.apellidoPaterno=apellidoPaterno;
		this.apellidoMaterno=apellidoMaterno;
		this.domicilio=domicilio;
		this.telefonos=telefonos;
		this.fechaNacimiento=nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNombreCompleto(){
		return ""+getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public ArrayList<String> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<String> telefonos) {
		this.telefonos = telefonos;
	}
	
}

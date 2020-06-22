package Modelo;

import java.util.Calendar;
import java.util.ArrayList;

public abstract class Persona {
	protected String nombre;
	protected String apellidoPaterno;
	protected String apellidoMaterno;
	protected Calendar fechaNacimiento;
	protected String domicilio;
	protected ArrayList<String> telefonos;
	
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
	
}

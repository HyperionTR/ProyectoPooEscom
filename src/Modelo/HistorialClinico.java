package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class HistorialClinico {

	private Calendar fechaNacimiento;
	private char sexo;
	private String tipoSangre;
	private int estatura;
	private int peso;
	private ArrayList<String> enfermHereditarias;
	private ArrayList<String> padecimientos;
	private ArrayList<String> alergias;
	
	
	public HistorialClinico(Calendar fechaNacimiento,
							char sexo,
							String tipoSangre,
							int estatura,
							int peso,
							ArrayList<String> enfermHereditarias,
							ArrayList<String> padecimientos,
							ArrayList<String> alergias){
		this.fechaNacimiento=fechaNacimiento;
		this.sexo=sexo;
		this.tipoSangre=tipoSangre;
		this.estatura=estatura;
		this.peso=peso;
		this.enfermHereditarias=enfermHereditarias;
		this.padecimientos=padecimientos;
		this.alergias=alergias;
	}
	
}

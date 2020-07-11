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
		this.setFechaNacimiento(fechaNacimiento);
		this.setSexo(sexo);
		this.setTipoSangre(tipoSangre);
		this.setEstatura(estatura);
		this.setPeso(peso);
		this.setEnfermHereditarias(enfermHereditarias);
		this.setPadecimientos(padecimientos);
		this.setAlergias(alergias);
	}


	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public String getTipoSangre() {
		return tipoSangre;
	}


	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}


	public int getEstatura() {
		return estatura;
	}


	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public ArrayList<String> getEnfermHereditarias() {
		return enfermHereditarias;
	}


	public void setEnfermHereditarias(ArrayList<String> enfermHereditarias) {
		this.enfermHereditarias = enfermHereditarias;
	}


	public ArrayList<String> getPadecimientos() {
		return padecimientos;
	}


	public void setPadecimientos(ArrayList<String> padecimientos) {
		this.padecimientos = padecimientos;
	}


	public ArrayList<String> getAlergias() {
		return alergias;
	}


	public void setAlergias(ArrayList<String> alergias) {
		this.alergias = alergias;
	}
	
}

package Modelo;

import java.util.ArrayList;

public class Diagnostico {

	private ArrayList<String> sintomas;
	private String padecimiento;
	//Atributos agregados
	//Agregado devido a la descripción
	private ArrayList<Receta> recetas;
	
	public Diagnostico(ArrayList<String> sintomas,String padecimiento, ArrayList<Receta> recetas){
		this.setSintomas(sintomas);
		this.setPadecimiento(padecimiento);
		this.setRecetas(recetas);
	}

	public ArrayList<String> getSintomas() {
		return sintomas;
	}

	public void setSintomas(ArrayList<String> sintomas) {
		this.sintomas = sintomas;
	}

	public String getPadecimiento() {
		return padecimiento;
	}

	public void setPadecimiento(String padecimiento) {
		this.padecimiento = padecimiento;
	}

	public ArrayList<Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(ArrayList<Receta> recetas) {
		this.recetas = recetas;
	}
	
}

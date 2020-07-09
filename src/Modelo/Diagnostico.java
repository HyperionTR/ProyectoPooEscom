package Modelo;

import java.util.ArrayList;

public class Diagnostico {

	private ArrayList<String> sintomas;
	private String padecimiento;
	//Atributos agregados
	//Agregado devido a la descripción
	private /*ArrayList<*/Receta/*>*/ recetas;
	
	public Diagnostico(ArrayList<String> sintomas,String padecimiento, /*ArrayList<*/Receta/*>*/ recetas){
		this.sintomas=sintomas;
		this.padecimiento=padecimiento;
		this.recetas=recetas;
	}
	
}

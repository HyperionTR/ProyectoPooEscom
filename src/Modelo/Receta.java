package Modelo;

import java.util.ArrayList;

public class Receta {

	private ArrayList<String> tratamiento;
	private ArrayList<Medicamento> medicamentos;
	
	public Receta(ArrayList<String> tratamiento, ArrayList<Medicamento> medicamentos){
		this.tratamiento=tratamiento;
		this.medicamentos=medicamentos;
	}
	
	public void imprimirReceta(){}
	
}

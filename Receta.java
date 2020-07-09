package Modelo;

import java.util.ArrayList;

public class Receta {

	private ArrayList<String> tratamiento;
	private ArrayList<Medicamento> medicamentos;
	private Cita cita;
	
	public Receta(ArrayList<String> tratamiento, ArrayList<Medicamento> medicamentos,Cita cita){
		this.tratamiento=tratamiento;
		this.medicamentos=medicamentos;
		this.cita=cita;
	}
	
	public void imprimirReceta(){}
	
}

package Modelo;

import java.util.ArrayList;

public class Receta {

	private ArrayList<String> tratamiento;
	private ArrayList<Medicamento> medicamentos;
	
	public Receta(ArrayList<String> tratamiento, ArrayList<Medicamento> medicamentos){
		this.setTratamiento(tratamiento);
		this.setMedicamentos(medicamentos);
	}
	
	public void imprimirReceta(){}

	public ArrayList<String> getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(ArrayList<String> tratamiento) {
		this.tratamiento = tratamiento;
	}

	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
}

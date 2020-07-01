package Modelo;

import java.util.Calendar;

import Controlador.Factory;

import java.util.ArrayList;


public class Medico extends Persona{

	private String especialidad;
	private String horario;
	
	public Medico(	String nombre,
					String apellidoPaterno,
					String apellidoMaterno,
					String domicilio,
					ArrayList<String> telefonos,
					Calendar nacimiento,
					//Atributos del médico
					String especialiad,
					String horario
				){
		super(nombre, apellidoPaterno, apellidoMaterno, domicilio, telefonos, nacimiento);
		this.setEspecialidad(especialiad);
		this.setHorario(horario);
	}
	
	public void emiteDiagnostico(){
		ArrayList<String> sintomas=new ArrayList<String>(1); 
		String padecimiento= "Tiene una enfermedad...";
		sintomas.add("Tos...");
		//ArrayList<Receta> recetas=getRecetasActuales(); 
		//ArrayList<Receta> recetas= preescribeReceta();
		ArrayList<Receta> recetas=Factory.getRecetas(); 
		Factory.crearDiagnostico(sintomas, padecimiento, recetas);
	}
	public ArrayList<Receta> preescribeReceta(){
		
		/*
		 * ESTA PRIMER IMPLEMENTACIÓN NO ES BUENA, YA QUE NECESITARÍAMOS DE ALGÚN LUGAR
		 * DONDE SE GUARDEN LAS RECETAS ACTUALES PARA USARLAS EN LA EMISIÓN DE 
		 * DIAGNÓSTICOS.
		 * LA MEJOR IDEA SERÍA IR MODIFICANDO EL ARREGLO DE RECETAS Y GUARDAR SUS CONTENIDOS
		 * CUANDO SE NECESITEN.
		 * 
		 * */
		
		//Estos ArrayList obtendrán datos de las GUI, no serán arreglos vacíos
		ArrayList<String> tratamiento=new ArrayList<String>(3); 
		tratamiento.add("Tomar medicamento cada 8 horas");
		
		Factory.crearReceta(tratamiento, Factory.getMedicamentos());
		//addRecetasActuales(tratamiento,medicamentos);
		
		//ALternativamente, puse que este método regresara una lista de recetas
		//return getRecetasActuales();
		return Factory.getRecetas();
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}

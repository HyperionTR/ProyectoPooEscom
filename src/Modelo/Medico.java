package Modelo;

import java.util.Calendar;

import Controlador.Factory;

import java.util.ArrayList;
import java.util.HashMap;


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
		ArrayList<String> sintomas=new ArrayList<String>();
                ArrayList<String> padecimientos=new ArrayList<String>(6);
                int p=(int) (Math.random()*5+0);
                padecimientos.add("Infección estomacal");
                padecimientos.add("Alergia alimentaria");
                padecimientos.add("Conjuntivitis");
                padecimientos.add("Infección en los oídos");
                padecimientos.add("Tendonitis");
                padecimientos.add("Infección en la garganta");
                //en el listener del botón para agregar síntomas:
                sintomas.add("sinntomas"/*Aquí en lugar de las comillas va el dato obtenido de la caja de texto*/);
		Factory.crearDiagnostico(sintomas, padecimientos.get(p), Factory.getRecetas());
	}
	public void preescribeReceta(){
		
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
		tratamiento.add("Tomar/aplicar cada 12hrs por 5 días");
                //obtuve la lista de los medicamentos
		HashMap<String,Medicamento> meds=Factory.getMedicamentos();
		ArrayList<Medicamento> medsTratamiento=new ArrayList<Medicamento>(3); //y generé un nuevo array para medicamentos
                int m;
                for(int i=0;i<3;i++)
                {
                    m=(int) (Math.random()*(meds.size()-1)+0);//y lo llené con 3 medicamentos aleatorios de los medicamentos existentes
                    medsTratamiento.add(meds.get(m));
                }
		Factory.crearReceta(tratamiento,medsTratamiento);
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

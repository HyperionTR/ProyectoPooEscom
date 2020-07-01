package Controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;
import Modelo.*;
import Vista.Test2;

public class Factory {
	
	//EL HASH MAP FUNCIONA DE MANERA SIMILAR A LO QUE SERÍA UNA MICRO-BASE DE DATOS
	//REGISTRA AL PACIENTE SEGÚN SU CURP COMO LLAVE
	//LO HICE PARA QUE EN LAS INTERFACES, PODAMOS OBTENER RÁPIDAMENTE UN PACIENTE
	//CON TAN SÓLO SABER SU CURP
	private static HashMap<String,Paciente> pacientes=new HashMap<String,Paciente>();
	private static ArrayList<Medico> medicos= new ArrayList<Medico>();
	private static ArrayList<Enfermera> enfermeras= new ArrayList<Enfermera>();
	private static ArrayList<Cita> citas= new ArrayList<Cita>();
	private static ArrayList<Medicamento> medicamentos= new ArrayList<Medicamento>();
	private static ArrayList<Receta> recetas= new ArrayList<Receta>();
	private static ArrayList<Diagnostico> diagnosticos= new ArrayList<Diagnostico>();
	private static ArrayList<HistorialClinico> historiales= new ArrayList<HistorialClinico>();
	
	
	public static void crearInstancias(){
		//DATOS MUY FEOS. CAMBIAR
		crearMedico("House", "Dr.", "Doe", "", new ArrayList<String>(3), Calendar.getInstance(), "Medicina", "");
		crearMedico("Hipócrates", "De", "Grecia", "", new ArrayList<String>(3), Calendar.getInstance(), "Medicina", "");
		crearHistorial(Calendar.getInstance(), 'm', "o", 10, 10, new ArrayList<String>(3), new ArrayList<String>(3), new ArrayList<String>(3));
		crearPaciente("John", "Doe", "Doe", "", new ArrayList<String>(3), Calendar.getInstance(), "CURP1", "", historiales.get(0));
		crearPaciente("David", "Jones", "Doe", "", new ArrayList<String>(3), Calendar.getInstance(), "CURP2", "", historiales.get(0));
		crearEnfermeras();
		crearInventario();
		//TEMPORAL, CADA MEDICO SACA UNA RECETA Y UN DIAGNÓSTICO
		for(Medico m:medicos){
			m.preescribeReceta();
			m.emiteDiagnostico();
		}
		//TEMPORAL, CADA ENFERMERA REGISTRA UNA CITA
		for(Enfermera e:enfermeras)
			e.registrarCita(pacientes.get("CURP1"), medicos.get(0), Calendar.getInstance(), 1600);
	}

	/*MÉTODOS DE CREACIÓN DE INSTANCIAS*/
	
	public static void crearPaciente(String nombre,
			String apellidoPaterno,
			String apellidoMaterno,
			String domicilio,
			ArrayList<String> telefonos,
			Calendar nacimiento,
			//Atributos del paciente
			String curp, 
			String seguro, 
			HistorialClinico 
			historial){
		pacientes.put(curp,new Paciente(nombre, apellidoPaterno, apellidoMaterno, domicilio, telefonos, nacimiento, curp, seguro, historial));
	}
	
	public static void crearMedico(String nombre,
			String apellidoPaterno,
			String apellidoMaterno,
			String domicilio,
			ArrayList<String> telefonos,
			Calendar nacimiento,
			//Atributos del médico
			String especialiad,
			String horario){
		medicos.add(new Medico(nombre, apellidoPaterno, apellidoMaterno, domicilio, telefonos, nacimiento, especialiad, horario));
	}
	
	public static void crearCita(Calendar fecha,
			int hora,
			Paciente paciente,
			Medico medico){
		citas.add(new Cita(fecha, hora, paciente, medico));
	}
	
	public static void crearHistorial(Calendar fechaNacimiento,
			char sexo,
			String tipoSangre,
			int estatura,
			int peso,
			ArrayList<String> enfermHereditarias,
			ArrayList<String> padecimientos,
			ArrayList<String> alergias){
		historiales.add(new HistorialClinico(fechaNacimiento, sexo, tipoSangre, estatura, peso, enfermHereditarias, padecimientos, alergias));
	}
	
	public static void crearReceta(ArrayList<String> tratamiento, ArrayList<Medicamento> medicamentos){
		recetas.add(new Receta(tratamiento, medicamentos));
	}
	
	public static void crearDiagnostico(ArrayList<String> sintomas,String padecimiento, ArrayList<Receta> recetas){
		diagnosticos.add(new Diagnostico(sintomas, padecimiento, recetas));
	}
	
	//Este método crea las únicas enfermeras que tendrán
	private static void crearEnfermeras(){
		enfermeras.add(new Enfermera("Jane", "Doe", "Did", "", new ArrayList<String>(3), Calendar.getInstance(), "admin"));
	}
	
	//Este método crea todos los medicamentos disponibles en la farmacia del centro de salud
	private static void crearInventario(){
		medicamentos.add(new Medicamento("Paracetamol", "Pastillas", 10.0));
		medicamentos.add(new Medicamento("Ibuprofeno", "Pastillas", 15.0));
		medicamentos.add(new Medicamento("Diclofenaco", "Pastillas", 20.0));
	}
	
	static void crearVentanaTest(){
		new Test2();
	}
	
	/*MÉTODOS PARA OBTENER LOS ATRIBUTOS*/
	
	public static HashMap<String,Paciente> getPacientes(){return pacientes;}
	public static ArrayList<Medico> getMedicos(){return medicos;}
	public static ArrayList<Enfermera> getEnfermeras(){return enfermeras;}
	public static ArrayList<Cita> getCitas(){return citas;}
	public static ArrayList<Medicamento> getMedicamentos(){return medicamentos;}
	public static ArrayList<Receta> getRecetas(){return recetas;}
	public static ArrayList<HistorialClinico> getHistoriales(){return historiales;}
	public static ArrayList<Diagnostico> getDiagnosticos(){return diagnosticos;}
}

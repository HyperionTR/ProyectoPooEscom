package Controlador;

import Modelo.*;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Calendar;

/*
 * EL PROÓSITO DE ESTA CLASE ES EL DE MOTIVOS DE DEPURACIÓN
 * YA QUE NOS PERMITE OBSERVAR FÁCILMENTE EL CONTENIDO DE
 * TODOS LOS ARREGLOS DE LA CLASE FACTORY, Y DE ESA MANERA
 * DETECTAR ALGÚN ERROR EN LOS DATOS.
 * 
 * */

public class ConOutput {

	public static void imprimirInfo(){
		System.out.println("---------------Pacientes-------------------");
		printPacientes();
		System.out.println("----------------Medicos--------------------");
		printMedicos();
		System.out.println("---------------Enfermeras------------------");
		printEnfereras();
		System.out.println("--------------Diagnósticos-----------------");		
		printDiagnosticos();
		System.out.println("-----------------Citas---------------------");
		printCitas();
	}
	
	public static void printPacientes(){
		HashMap<String,Paciente> pacientes=Factory.getPacientes();
		for(String i:pacientes.keySet()){
			//Atributos de la persona
			String s="";
			s+="\nNombre: "+pacientes.get(i).getNombre();
			s+="\nApellidos: "+pacientes.get(i).getApellidoPaterno() + " " + pacientes.get(i).getApellidoMaterno();
			s+="\nDomicilio: "+pacientes.get(i).getDomicilio();
			s+="\nTeléfonos: \n";
			for(String j:pacientes.get(i).getTelefonos())	
				s+=j+"\n";
			s+="Nacimiento: "+pacientes.get(i).getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
			s+="/"+pacientes.get(i).getFechaNacimiento().getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("es"));
			s+="/"+pacientes.get(i).getFechaNacimiento().get(Calendar.YEAR);
			
			//ATRIBUTOS DE PACIENTE
			s+="\nCURP: "+pacientes.get(i).getCURP();
			s+="\nSeguro: "+pacientes.get(i).getClaveSeguro();
			System.out.println(s);
			printHistorial(pacientes.get(i));
		}
	}
	
	public static void printMedicos(){
                
		for(Medico med:Factory.getMedicos()){
			//Atributos de la persona
			String s="";
			s+="\nNombre: "+med.getNombre();
			s+="\nApellidos: "+med.getApellidoPaterno() + " " + med.getApellidoMaterno();
			s+="\nDomicilio: "+med.getDomicilio();
			s+="\nTeléfonos: \n";
			for(String j:med.getTelefonos())	
				s+=j+"\n";
			s+="Nacimiento: "+ med.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
			s+="/"+med.getFechaNacimiento().getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("es"));
			s+="/"+med.getFechaNacimiento().get(Calendar.YEAR);
			
			//Atributos del médico
			s+="\nEspecialidad: "+med.getEspecialidad();
			s+="\nHorario: "+med.getHorario();
			System.out.println(s);
		}
	}
	
	public static void printEnfereras(){
		for(Enfermera med:Factory.getEnfermeras()){
			//Atributos de la persona
			String s="";
			s+="\nNombre: "+med.getNombre();
			s+="\nApellidos: "+med.getApellidoPaterno() + " " + med.getApellidoMaterno();
			s+="\nDomicilio: "+med.getDomicilio();
			s+="\nTeléfonos: \n";
			for(String j:med.getTelefonos())	
				s+=j+"\n";
			s+="Nacimiento: "+med.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
			s+="/"+med.getFechaNacimiento().getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("es"));
			s+="/"+med.getFechaNacimiento().get(Calendar.YEAR);
			
			//Atributos de la enfermera
			s+="\nClave de acceso: "+med.getClaveAcceso();
			System.out.println(s);
		}
	}
	public static void printDiagnosticos(){
		for(Diagnostico i:Factory.getDiagnosticos()){
			String s="................Diagnostico......................";
			s+="\nSíntomas: ";
			for(String sint:i.getSintomas())
				s+=sint+"\n";
			s+="\nPadecimiento: "+i.getPadecimiento();
			s+="\nRecetas: ";
			System.out.println(s);
			printRecetas(i.getRecetas());
		}
	}
	public static void printRecetas(ArrayList<Receta> recetas){
		for(Receta i:recetas){
			String s=".....................Receta.....................\n";
			for(String j:i.getTratamiento())
				s+=j+"\n";
			s+="Medicamentos recetados: \n";
			System.out.println(s);
			for(Medicamento m:i.getMedicamentos())
				printMedicamento(m);
		}
	}
	public static void printCitas(){
		for(Cita cita:Factory.getCitas()){
			String s="\n";
			s+="Fecha de la cita: "+cita.getFecha().get(Calendar.DATE);
			s+="/"+cita.getFecha().getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("es"));
			s+="/"+cita.getFecha().get(Calendar.YEAR);
			
			s+="\nHora: "+cita.getHora();
			s+="\nPaciente: "+cita.getPaciente().getNombreCompleto();
			s+="\nMédico: "+cita.getMedico().getNombreCompleto();
			System.out.println(s);
		}
	}
	public static void printMedicamento(Medicamento med){
		String s="";
		s+="Sustancia activa: "+med.getSustancia();
		s+="\nPresentación: "+med.getPresentacion();
		s+="\nPrecio: "+med.getPrecio();
		System.out.println(s);
	}
	public static void printHistorial(Paciente pac){
		HistorialClinico hist= pac.getHistorial();
		String s="\n";
		s+="\nFecha de nacimiento: "+hist.getFechaNacimiento();
		s+="\nSexo: "+hist.getSexo();
		s+="\nTipo de sangre: "+hist.getTipoSangre();
		s+="\nEstatura: "+hist.getEstatura();
		s+="\nPeso: "+hist.getPeso();
		s+="\nEnfermedades hereditarias: ";
		for(String enf:hist.getEnfermHereditarias())
			s+=enf+"\n";
		s+="\nPadecimientos: ";
		for(String pad:hist.getPadecimientos())
			s+=pad+"\n";
		s+="\nAlergias: ";
		for(String al:hist.getAlergias())
			s+=al+"\n";
		System.out.println(s);
	}
	
//	public void printPersona(){
//	}
}

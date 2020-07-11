package Controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;
import Modelo.*;
import Vista.Test2;

public class Factory {

	private static HashMap<String,Paciente> pacientes=new HashMap<String,Paciente>();
	private static ArrayList<Medico> medicos= new ArrayList<Medico>();
	private static ArrayList<Enfermera> enfermeras= new ArrayList<Enfermera>();
	private static ArrayList<Cita> citas= new ArrayList<Cita>();
	private static ArrayList<Medicamento> medicamentos= new ArrayList<Medicamento>();
	private static ArrayList<Receta> recetas= new ArrayList<Receta>();
	private static ArrayList<Diagnostico> diagnosticos= new ArrayList<Diagnostico>();
	private static ArrayList<HistorialClinico> historiales= new ArrayList<HistorialClinico>(5);
	
	
	public static void crearInstancias(){
		//--------------------------MEDICOS---------------------------//
                ArrayList<String> telefonos=new ArrayList<String>();
                Calendar fechaN=Calendar.getInstance();
                telefonos.add("5573838384");
                telefonos.add("38400384");
                fechaN.set(1970,3,29);
                System.out.println(fechaN.getTime());
		crearMedico("Gregory", "House", "Laurie", "59894 Dino Fords Apt. 757, East Erictown",telefonos, fechaN, "Infectología y Nefrología", "Domingo-Viernes 7:00-15:00");
                telefonos.clear();
                fechaN.clear();
                telefonos.add("5838364504");
                telefonos.add("42427998");
                fechaN.set(1971,6,19);
		crearMedico("James", "Wilson", "Sean", "20378 Delbert Fields Apt. 328, Emmetthaven",telefonos, fechaN, "Oncología", "Domingo-Viernes 10:00-18:00");
                telefonos.clear();
                fechaN.clear();
                telefonos.add("5545594739");
                telefonos.add("5587467261");
                telefonos.add("93038489");
                fechaN.set(1979,4,1);
		crearMedico("Allison", "Cameron", "Morrison", "68545 Ebert Cove, West Martyport",telefonos, fechaN, "Inmunología", "Domingo-Viernes 7:00-15:00");
                telefonos.clear();
                fechaN.clear();
                telefonos.add("78275690");
                fechaN.set(1969,1,31);
		crearMedico("Lisa", "Cuddy", "Edelstein", "600 Jakubowski Fort Apt. 738, Madisynton",telefonos, fechaN, "Endocrinología", "Lunes-Viernes 9:00-16:30");
                telefonos.clear();
                fechaN.clear();
                telefonos.add("5578926523");
                telefonos.add("38292734");
                fechaN.set(1975,8,28);
		crearMedico("Eric", "Foreman", "Epps", "7906 Aisha Drive, East Junius",telefonos, fechaN, "Neurología", "Domingo-Viernes 7:00-15:00");
                //--------------------------------------------------------------
		
                //-------------------------HISTORIALES------------------------//
                ArrayList<String> enfermHereditarias=new ArrayList<String>(), padecimientos=new ArrayList<String>(), alergias=new ArrayList<String>();
		/*fechaN.clear();
                fechaN.set(1985,12,2);*/
                enfermHereditarias.add("Diabetes");
                enfermHereditarias.add("Anemia");
                padecimientos.add("Asma");
                alergias.add("Penicilinas");
                crearHistorial(fechaN, 'M', "RH B-", 173, 78, enfermHereditarias,padecimientos,alergias);
                //fechaN.clear();
                enfermHereditarias.clear();
                padecimientos.clear();
                alergias.clear();
                //fechaN.set(1998,10,29);
                enfermHereditarias.add("Hipertensión");
                padecimientos.add("Ninguno");
                alergias.add("Ninguna");
                crearHistorial(fechaN, 'F', "RH O-", 157, 50, enfermHereditarias,padecimientos,alergias);
                //fechaN.clear();
                enfermHereditarias.clear();
                padecimientos.clear();
                alergias.clear();
                //fechaN.set(1989,3,30);
                enfermHereditarias.add("Ninguna");
                padecimientos.add("Epilepsia");
                alergias.add("cefalosporinas");
                crearHistorial(fechaN, 'M', "RH O+", 185, 90, enfermHereditarias,padecimientos,alergias);
                //fechaN.clear();
                enfermHereditarias.clear();
                padecimientos.clear();
                alergias.clear();
                //fechaN.set(1953,12,2);
                enfermHereditarias.add("Ninguna");
                padecimientos.add("Gastritis");
                alergias.add("Ninguna");
                crearHistorial(fechaN, 'F', "RH AB-", 140, 38, enfermHereditarias,padecimientos,alergias);
                //fechaN.clear();
                enfermHereditarias.clear();
                padecimientos.clear();
                alergias.clear();
                //fechaN.set(1985,12,2);
                enfermHereditarias.add("Cáncer");
                padecimientos.add("Obesidad");
                alergias.add("Loratadina");
                crearHistorial(fechaN, 'M', "RH A+", 173, 98, enfermHereditarias,padecimientos,alergias);
                //--------------------------------------------------------------
                
                //--------------------------PACIENTES-------------------------//
                crearPaciente("John", "Doe", "Doe", "", new ArrayList<String>(3), Calendar.getInstance(), "CURP1", "", historiales.get(0));
		crearPaciente("Hugo", "Gámez", "Segundo", "Ruela Antonio, 918, 33º E, L' Clemente", telefonos, fechaN, "GASH851202HRCRNU00", "", historiales.get(1));
		crearPaciente("Anna", "Rousevelt", "Scott", "4728 Hammes Grove Suite 017", telefonos, fechaN, "ROSA981029MHRNKJ09", "", historiales.get(1));
		crearPaciente("Watson", "Hessel", "Wilkerston", "111 Harris Locks, Daniellastad", telefonos, fechaN, "HEWW890330HJKUKL02", "", historiales.get(2));
		crearPaciente("Aika", "Koide", "Kurosaki", "2089 Confederate Drive, Camillus, NY 13031", telefonos, fechaN, "KOKA531202MKDUJJ05", "", historiales.get(3));
		crearPaciente("Martin", "Naranjo", "Hijo", "Av. Berta Tamayo, 88, Piso 94, Claudia de Mata", telefonos,fechaN, "NAHM851202HMKSNY03", "", historiales.get(4));
		crearEnfermeras();
		crearInventario();
		//TEMPORAL, CADA MEDICO SACA UNA RECETA Y UN DIAGNÓSTICO
		for(Medico m:medicos){
			m.preescribeReceta();
			m.emiteDiagnostico();
		}
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

package Modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Locale;


public class Paciente extends Persona{

	private String CURP;
	private String claveSeguro;
	private HistorialClinico historial;
	
	//Iniciando con los atributos de persona
	public Paciente(String nombre,
					String apellidoPaterno,
					String apellidoMaterno,
					String domicilio,
					ArrayList<String> telefonos,
					Calendar nacimiento,
					//Atributos del paciente 
					String seguro, 
					HistorialClinico 
					historial){
		super(nombre, apellidoPaterno, apellidoMaterno, domicilio, telefonos, nacimiento);
		this.CURP=generarCURP(apellidoPaterno,apellidoMaterno,nombre,nacimiento,historial);
		this.setClaveSeguro(seguro);
		this.setHistorial(historial);
	}

	public String getCURP() {
		return CURP;
	}

	public void setCURP(String cURP) {
		CURP = cURP;
	}

	public String getClaveSeguro() {
		return claveSeguro;
	}

	public void setClaveSeguro(String claveSeguro) {
		this.claveSeguro = claveSeguro;
	}

	public HistorialClinico getHistorial() {
		return historial;
	}

	public void setHistorial(HistorialClinico historial) {
		this.historial = historial;
	}
	public String generarCURP(String apellidoPaterno,String apellidoMaterno,String nombre,Calendar nacimiento, HistorialClinico hist)
        {
            String CURP;
            StringBuilder cons=new StringBuilder();
            try
            {
                cons.append(apellidoPaterno.charAt(0));
                cons.append(apellidoPaterno.charAt(1));
                cons.append(apellidoMaterno.charAt(0));
                cons.append(nombre.charAt(0));
            }
            catch(StringIndexOutOfBoundsException e)
            {
                System.out.println("No se puede generar CURP, nombre/apellido(s) no pueden ser null");
                return "error generando CURP";
            }
            SimpleDateFormat form=new SimpleDateFormat("YYMM");
            CURP= cons.toString();
            CURP+=form.format(nacimiento.getTime());
            if(nacimiento.get(Calendar.DAY_OF_MONTH)<10) CURP+="0";
            CURP+=nacimiento.get(Calendar.DAY_OF_MONTH);
            CURP=CURP.toUpperCase();
            CURP+=hist.getSexo();
            for(int c=0;c<5;c++)
            {
                String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                int n=(int) (Math.random() * 25-0);
                CURP+=abc.charAt(n);   
            }
            CURP+="0" + (int) (Math.random()*(9)+0);
            return CURP;
        }
}

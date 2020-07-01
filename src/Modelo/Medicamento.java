package Modelo;

public class Medicamento {

	private String sustancia;
	private String presentacion;
	private double precio;
	
	public Medicamento(	String sustancia,
						String presentacion,
						double precio){
		this.setSustancia(sustancia);
		this.setPresentacion(presentacion);
		this.setPrecio(precio);
	}
	
	public boolean tieneAdeudo(){return true;}
	public double calcularAdeudo(){return 0.0;}

	public String getSustancia() {
		return sustancia;
	}

	public void setSustancia(String sustancia) {
		this.sustancia = sustancia;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}

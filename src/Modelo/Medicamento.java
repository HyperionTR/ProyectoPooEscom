package Modelo;

public class Medicamento {

	private String sustancia;
	private String presentacion;
	private double precio;
	
	public Medicamento(	String sustancia,
						String presentacion,
						double precio){
		this.sustancia=sustancia;
		this.presentacion=presentacion;
		this.precio=precio;
	}
	
	public boolean tieneAdeudo(){return true;}
	public double calcularAdeudo(){return 0.0;}
	
}

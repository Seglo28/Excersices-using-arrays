package com.practice.mapeos;

public class Boton {
	
	private String nombreBoton = "";
	private String materialBoton = "";
	private String FuncionBoton = "";
	
	
	public String getNombreBoton() {
		return nombreBoton;
	}
	public void setNombreBoton(String nombreBoton) {
		this.nombreBoton = nombreBoton;
	}
	public String getMaterialBoton() {
		return materialBoton;
	}
	public void setMaterialBoton(String materialBoton) {
		this.materialBoton = materialBoton;
	}
	public String getFuncionBoton() {
		return FuncionBoton;
	}
	public void setFuncionBoton(String funcionBoton) {
		FuncionBoton = funcionBoton;
	}
	
	public Boton() {
		super();
	}
	
	public Boton(String nombreBoton, String materialBoton, String funcionBoton) {
		super();
		this.nombreBoton = nombreBoton;
		this.materialBoton = materialBoton;
		FuncionBoton = funcionBoton;
	}
	
	
	
	
	
}

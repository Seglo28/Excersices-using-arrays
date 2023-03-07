package com.practice.mapeos;

public class Cocina {
	
	private String marca = "";
	private String modelo = "";
	private int numeroQumadores = 0;
	private Boton[] botones;
	private TipoCocina tipoCocina;
	private Carcasa carcasa;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroQumadores() {
		return numeroQumadores;
	}
	public void setNumeroQumadores(int numeroQumadores) {
		this.numeroQumadores = numeroQumadores;
	}
	public Boton[] getBotones() {
		return botones;
	}
	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}
	public TipoCocina getTipoCocina() {
		return tipoCocina;
	}
	public void setTipoCocina(TipoCocina tipoCocina) {
		this.tipoCocina = tipoCocina;
	}
	public Carcasa getCarcasa() {
		return carcasa;
	}
	public void setCarcasa(Carcasa carcasa) {
		this.carcasa = carcasa;
	}
	public Cocina() {
		super();
	}
	public Cocina(String marca, String modelo, int numeroQumadores, Boton[] botones, TipoCocina tipoCocina,
			Carcasa carcasa) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroQumadores = numeroQumadores;
		this.botones = botones;
		this.tipoCocina = tipoCocina;
		this.carcasa = carcasa;
	}
	
	
	
	
	
}

package com.practice.entities;

public class AutomovilEntity {

	private String modelo = "";
	private int ano = 0;
	private String marca = "";
	private LlantasEntity[] llantas;
	
	
	public AutomovilEntity() {
	}

	public AutomovilEntity(String modelo, int ano, String marca, LlantasEntity[] marcaLlanta) {
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
		this.llantas = marcaLlanta;
	}
	

	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LlantasEntity[] getLlantas() {
		return llantas;
	}

	public void setLlantas(LlantasEntity[] llantas) {
		this.llantas = llantas;
	}



	



}

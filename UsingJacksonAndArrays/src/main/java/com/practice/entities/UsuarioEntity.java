package com.practice.entities;

public class UsuarioEntity {
	
	private String nombre;
	private String dui;
	private String contrasena;
	private double cantidadDolares;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDui() {
		return dui;
	}
	public void setDui(String dui) {
		this.dui = dui;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public double getCantidadDolares() {
		return cantidadDolares;
	}
	public void setCantidadDolares(double cantidadDolares) {
		this.cantidadDolares = cantidadDolares;
	}
	
	public UsuarioEntity() {}
	
	public UsuarioEntity(String nombre, String dui, String contrasena, double cantidadDolares) {
		super();
		this.nombre = nombre;
		this.dui = dui;
		this.contrasena = contrasena;
		this.cantidadDolares = cantidadDolares;
	}
	
	
	
}

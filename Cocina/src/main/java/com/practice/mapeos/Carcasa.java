package com.practice.mapeos;

public class Carcasa {

	private String material = "";
	private String color = "";
	
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Carcasa() {
		super();
	}
	
	public Carcasa(String material, String color) {
		super();
		this.material = material;
		this.color = color;
	}
	
	
	
}

package com.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.mapeos.Boton;
import com.practice.mapeos.Carcasa;
import com.practice.mapeos.Cocina;
import com.practice.mapeos.TipoCocina;

@RestController
@RequestMapping("/CocinaController")
public class Controlador {

	TipoCocina cocina = new TipoCocina();
	Carcasa carcasa = new Carcasa();
	
	Boton[] Perilla = {
		new Boton ("Chispero", "plastico", "Enciende la cocina"),
		new Boton ("Quemadores frontales", "plastico", "llama fuerte"),
		new Boton ("Quemadores traseros", "plastico", "llama suave"),
	};
	
	Boton[] Tactil = {
		new Boton ("Principal", "tactil", "Enciende la cocina"),
		new Boton ("Quemadores frontales", "tactil", "llama fuerte"),
		new Boton ("Quemadores traseros", "tactil", "llama suave"),
	};
	
	Boton[] Botones = {
		new Boton ("Principal", "tactil", "Enciende la cocina"),
		new Boton ("Quemadores frontales", "tactil", "llama fuerte"),
		new Boton ("Quemadores traseros", "tactil", "llama suave"),
	};
	
	Cocina[] CocinaArray = {
		new Cocina ("Oster", "c222.-0", 4, Perilla, new TipoCocina("Analogica"), new Carcasa("Aluminio", "Gris")),
		new Cocina ("Cetron", "Electron", 6, Tactil, new TipoCocina("Electrica"), new Carcasa("Aluminio", "Blanco")),
		new Cocina ("Chinesse", "White - 4", 4, Botones, new TipoCocina("Analogica"), new Carcasa("Aluminio", "Gris")),
		new Cocina ("Oster", "X22.-0", 4, Perilla, new TipoCocina("Analogica"), new Carcasa("Aluminio", "Gris")),
	};
	
	@PostMapping("/caracteristicasCocina")
	public List<Cocina> caracterisiticasCocina (@RequestBody Cocina parametro){
		List<Cocina> salida = new ArrayList<Cocina>();
		for(Cocina arrayCocina : this.CocinaArray) {
			if(parametro.getMarca().equals(arrayCocina.getMarca())) {
				salida.add(arrayCocina);
			}
		}
		return salida;
	}
}

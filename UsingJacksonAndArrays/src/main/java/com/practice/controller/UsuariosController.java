package com.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.clases.UsuarioMetodos;
import com.practice.entities.AutomovilEntity;
import com.practice.entities.LlantasEntity;
import com.practice.entities.UsuarioEntity;

import videosMapeos.Audio;
import videosMapeos.Capturador;
import videosMapeos.Formato;
import videosMapeos.TipoVideo;

@RestController
@RequestMapping("/controller")
public class UsuariosController {
	
	UsuarioEntity[] listaDeUsuarios = {
        new UsuarioEntity("Adonai", "041045996", "1234", 300),
        new UsuarioEntity("Gloria", "051851496", "1234", 10000),
        new UsuarioEntity("Leydi", "051851495", "1234", 3000)
	};
	
	LlantasEntity[] grupoDeLlantas1 = {
			new LlantasEntity("Dunlo"),
			new LlantasEntity("Toyotire"),
			new LlantasEntity("Michellin")
	};
	
	LlantasEntity[] grupoDeLlantas2 = {
			new LlantasEntity("Dunlo"),
			new LlantasEntity("Dunlo"),
			new LlantasEntity("Dunlo")
	};
	
	
	LlantasEntity[] grupoDeLlantas3 = {
			new LlantasEntity("Toyotire"),
			new LlantasEntity("Toyotire"),
			new LlantasEntity("Toyotire"),
			new LlantasEntity("Toyotire")
	};
	
	LlantasEntity[] grupoDeLlantas4 = {
			new LlantasEntity("Michellin"),
			new LlantasEntity("Michellin"),
			new LlantasEntity("Michellin"),
			new LlantasEntity("Toyotire"),
	};
	
	
	
	AutomovilEntity[] listaAutomoviles = {
			new AutomovilEntity("Toyota", 2022, "", grupoDeLlantas1),
			new AutomovilEntity("Nissan", 2022, "", grupoDeLlantas2),
			new AutomovilEntity("Honda", 2023, "", grupoDeLlantas3),
			new AutomovilEntity("Mazda", 2023, "", grupoDeLlantas3),
	};
	
	String [] listaString = {"a", "b", "c", "d"};
	double [] listaDouble = {1.00, 2.00, 3.00};
	
	UsuarioMetodos usuarioLista = new UsuarioMetodos();
	
	@PostMapping("/validacion")
	public UsuarioEntity validacion (@RequestBody UsuarioEntity usuario ) {
		for(UsuarioEntity user :this.listaDeUsuarios) {
			
			String dui = usuario.getDui();
			
			if(dui.equals(user.getDui())) {
				usuario.setNombre(user.getNombre());
				usuario.setContrasena("");
				usuario.setCantidadDolares(user.getCantidadDolares());
			}
		}
		return usuario;
	}

	String [] listaDeFrutas = {
			"mango",
			"apple",
			"apple",
			"pineapple"
	};
	
	@PostMapping("/filtrarAuto")
	public List<AutomovilEntity>mostrarAutomoviles(@RequestBody AutomovilEntity auto){
		List<AutomovilEntity> salida = new ArrayList<AutomovilEntity>();
		for(AutomovilEntity vehiculo: this.listaAutomoviles) {
			if(auto.getAno()==vehiculo.getAno()) {
				salida.add(vehiculo);
			}
		}
		return salida;
	}
	
	@PostMapping("/confiltro")
	public List<String> pruebaFiltro (@RequestParam String arg) {
		
		List<String> salidaCadenas = new ArrayList<String>();
		
		for(String datoEnArray : this.listaDeFrutas) {
			if(arg.equals(datoEnArray)) {
				salidaCadenas.add(datoEnArray);
			}
		}
		return salidaCadenas;
	}
	
	
	private String listaAutos(AutomovilEntity[] autos) {
		String salida = "";
		for(AutomovilEntity auto : autos) {
			
		}
		
		
		return salida;
	}
	
	private String findMarcaLlanta(LlantasEntity[] llantas, String buscarEstaMarca) {
		String salida = "";
		
		List<LlantasEntity> llantasEncontradas = new ArrayList<LlantasEntity>();
		
		for(LlantasEntity llanta : llantas) {
			if(buscarEstaMarca.equals(llanta.getMarcaLlanta())) {
				salida = "encontrado";
				llantasEncontradas.add(llanta);
			}
		}
		
		return salida;
	}
	
	
}



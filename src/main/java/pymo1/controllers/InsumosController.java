package pymo1.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pymo1.models.InsumosModel;
import pymo1.services.InsumosService;

@RestController
public class InsumosController {
	
	private final InsumosService insumosService;
	
	public InsumosController(@Autowired InsumosService insumosService) {
		this.insumosService = insumosService;
	}

	@GetMapping("/insumos")
	public ArrayList<InsumosModel> obtenerDatosInsumos(){
		return insumosService.obtenerDatosInsumos();

	}
	
	@PostMapping("/guardarinsumos")
	public InsumosModel guardarDatosInsumos(@RequestBody InsumosModel insumosModel) {
		return insumosService.guardarDatosInsumo(insumosModel);
		
		
	}
	
	@DeleteMapping(path = "eliminarbodega/{id}")                      
	public boolean eliminarDatoInsumos(@PathVariable("id")Integer id) {
		return insumosService.eliminarDatoInsumos(id);
		
	} 
}

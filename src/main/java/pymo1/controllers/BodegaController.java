package pymo1.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pymo1.models.BodegaModel;
import pymo1.services.BodegaService;

@RestController
public class BodegaController {
	
	private final BodegaService bodegaService;
	
	public BodegaController(@Autowired BodegaService bodegaService) {
		this.bodegaService = bodegaService;
	}

	@GetMapping("/bodega")
	public ArrayList<BodegaModel> obtenerDatosBodega(){
		return bodegaService.obtenerDatosBodega();
		
	}
	
	@PostMapping("/guardarbodega")
	public BodegaModel guardarDatosBodega(@RequestBody BodegaModel bodegaModel) {
		return bodegaService.guardarDatosBodega(bodegaModel);
		
		
	}
	
	@DeleteMapping(path = "eliminarbodega/{id}")                      
	public boolean eliminarDatoBodega(@PathVariable("id")Integer id) {
		return bodegaService.eliminarDatoBodega(id);
		
		
	} 
}

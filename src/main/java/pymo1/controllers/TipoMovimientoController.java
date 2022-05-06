package pymo1.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pymo1.models.TipoMovimiento;
import pymo1.services.TipoMovimientoService;

@RestController
public class TipoMovimientoController {
	
	private final TipoMovimientoService tipoMovimientoService;
	
	public TipoMovimientoController(@Autowired TipoMovimientoService tipoMovimientoService) {
		this.tipoMovimientoService = tipoMovimientoService;
	}

	@GetMapping("/movimientos")
	public ArrayList<TipoMovimiento> obtenerDatosMovimientos(){
		return tipoMovimientoService.obtenerDatosMovimiento();
	}
	
	@PostMapping("/guardarmovimientos")
	public TipoMovimiento guardarDatosMovimientos(@RequestBody TipoMovimiento tipoMovimiento) {
		return tipoMovimientoService.guardarDatosMovimiento(tipoMovimiento);
		
	}
	
	@DeleteMapping(path = "borrarmovimiento/{id}")                      
	public boolean eliminarDatoMovimiento(@PathVariable("id")Integer id) {
		return tipoMovimientoService.eliminarDatoMovimiento(id);
	} 
}

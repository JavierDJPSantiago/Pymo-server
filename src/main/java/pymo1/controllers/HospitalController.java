package pymo1.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pymo1.models.HospitalModel;
import pymo1.services.HospitalService;

@RestController
public class HospitalController {
	
	private final HospitalService hospitalService;
	
	public HospitalController(@Autowired HospitalService hospitalService) {
		this.hospitalService = hospitalService;
	}

	@GetMapping("/hospital")
	public ArrayList<HospitalModel> obtenerDatosHospital(){
		return hospitalService.obtenerDatosHospital();
	}
	
	@PostMapping("/guardarhospital")
	public HospitalModel guardarDatosHospital(@RequestBody HospitalModel hospitalModel) {
		return hospitalService.guardarDatosHospital(hospitalModel);
		
	}
	
	@DeleteMapping(path = "eliminarhospital/{id}")                      
	public boolean eliminarDatoHospital(@PathVariable("id")Integer id) {
		return hospitalService.eliminarDatoHospital(id);
		
	} 
}

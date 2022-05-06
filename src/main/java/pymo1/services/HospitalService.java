package pymo1.services;

import java.util.ArrayList;

import pymo1.models.HospitalModel;

public interface HospitalService {
	
	ArrayList<HospitalModel> obtenerDatosHospital();

     //guarda datos en sql
	HospitalModel guardarDatosHospital(HospitalModel hospitalModel);
 	
 	//borrar
      public boolean eliminarDatoHospital(Integer id);
}

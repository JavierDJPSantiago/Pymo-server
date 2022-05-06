package pymo1.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pymo1.models.HospitalModel;
import pymo1.repositories.HospitalRepository;

@Service
public class HospitalServiceImp implements HospitalService {
	
	private final HospitalRepository hospitalRepository;
	
	public HospitalServiceImp (@Autowired HospitalRepository hospitalRepository) {
		this.hospitalRepository = hospitalRepository;
	}

	@Override
	public ArrayList<HospitalModel> obtenerDatosHospital() {
		return (ArrayList<HospitalModel>) hospitalRepository.findAll();
	}

	@Override
	public HospitalModel guardarDatosHospital(HospitalModel hospitalModel) {
		return hospitalRepository.save(hospitalModel);
	}

	@Override
	public boolean eliminarDatoHospital(Integer id) {
		try {
 			hospitalRepository.deleteById(id);
 			return true;
 		}catch (Exception error) {
 			return false;
 		}
	}


}

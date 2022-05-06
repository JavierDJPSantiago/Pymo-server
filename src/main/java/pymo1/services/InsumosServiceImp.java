package pymo1.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pymo1.models.InsumosModel;
import pymo1.repositories.InsumosRepository;

@Service
public class InsumosServiceImp implements InsumosService {
	
	private final InsumosRepository insumosRepository;
	
	public InsumosServiceImp (@Autowired InsumosRepository insumosRepository) {
		this.insumosRepository = insumosRepository;
	}

	@Override
	public ArrayList<InsumosModel> obtenerDatosInsumos() {
		return (ArrayList<InsumosModel>) insumosRepository.findAll();

	}


	@Override
	public InsumosModel guardarDatosInsumo(InsumosModel insumosModel) {
		return insumosRepository.save(insumosModel);

	}


	@Override
	public boolean eliminarDatoInsumos(Integer id) {
		try {
			insumosRepository.deleteById(id);
 			return true;
 		}catch (Exception error) {
 			return false;
 		}
	}

	

}

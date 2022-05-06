package pymo1.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pymo1.models.BodegaModel;
import pymo1.repositories.BodegaRepository;

@Service
public class BodegaServiceImp implements BodegaService{
	
	private final BodegaRepository bodegaRepository;
	
	public BodegaServiceImp (@Autowired BodegaRepository bodegaRepository) {
		this.bodegaRepository = bodegaRepository;
	}

	@Override
	public boolean eliminarDatoBodega(Integer id) {
		try {
			bodegaRepository.deleteById(id);
 			return true;
 		}catch (Exception error) {
 			return false;
 		}
	}




	@Override
	public ArrayList<BodegaModel> obtenerDatosBodega() {
		return (ArrayList<BodegaModel>) bodegaRepository.findAll();
	}




	@Override
	public BodegaModel guardarDatosBodega(BodegaModel bodegaModel) {
		return bodegaRepository.save(bodegaModel);
	}


	
	

}

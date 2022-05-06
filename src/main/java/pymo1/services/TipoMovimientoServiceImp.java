package pymo1.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pymo1.models.TipoMovimiento;
import pymo1.repositories.TipoMovimientoRepository;

@Service
public class TipoMovimientoServiceImp implements TipoMovimientoService {
	
	private final TipoMovimientoRepository tipoMovimientoRepository;
	
	public TipoMovimientoServiceImp (@Autowired TipoMovimientoRepository tipoMovimientoRepository) {
		this.tipoMovimientoRepository = tipoMovimientoRepository;
	}

	@Override
	public ArrayList<TipoMovimiento> obtenerDatosMovimiento() {
		return (ArrayList<TipoMovimiento>) tipoMovimientoRepository.findAll();
	}

	@Override
	public TipoMovimiento guardarDatosMovimiento(TipoMovimiento tipoMovimiento) {
		return tipoMovimientoRepository.save(tipoMovimiento);
	}

	@Override
	public boolean eliminarDatoMovimiento(Integer id) {
		try {
			tipoMovimientoRepository.deleteById(id);
 			return true;
 		}catch (Exception error) {
 			return false;
 		}
	}

	
	

}

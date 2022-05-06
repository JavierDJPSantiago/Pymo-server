package pymo1.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pymo1.models.ProductoModel;
import pymo1.repositories.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService {
	
	private final ProductoRepository productoRepository;
	
	public ProductoServiceImp (@Autowired ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	@Override
	public ArrayList<ProductoModel> obtenerDatosProductos() {
		return (ArrayList<ProductoModel>) productoRepository.findAll();
	}

	@Override
	public ProductoModel guardarDatosProductos(ProductoModel productoModel) {
		return productoRepository.save(productoModel);
	}

	@Override
	public boolean eliminarDatoProductos(Integer id) {
		try {
 			productoRepository.deleteById(id);
 			return true;
 		}catch (Exception error) {
 			return false;
 		}
	}


}

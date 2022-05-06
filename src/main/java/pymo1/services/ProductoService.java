package pymo1.services;

import java.util.ArrayList;

import pymo1.models.ProductoModel;

public interface ProductoService {
	
	ArrayList<ProductoModel> obtenerDatosProductos();

     //guarda datos en sql
 	ProductoModel guardarDatosProductos(ProductoModel productoModel);
 	
 	//borrar
      public boolean eliminarDatoProductos(Integer id);
}

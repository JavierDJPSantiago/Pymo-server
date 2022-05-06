package pymo1.services;

import java.util.ArrayList;

import pymo1.models.BodegaModel;

public interface BodegaService {
	
	ArrayList<BodegaModel> obtenerDatosBodega();

     //guarda datos en sql
	BodegaModel guardarDatosBodega(BodegaModel bodegaModel);
 	
 	//borrar
      public boolean eliminarDatoBodega(Integer id);
}


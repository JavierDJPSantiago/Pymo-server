package pymo1.services;

import java.util.ArrayList;

import pymo1.models.InsumosModel;

public interface InsumosService {
	
	ArrayList<InsumosModel> obtenerDatosInsumos();

     //guarda datos en sql
	InsumosModel guardarDatosInsumo(InsumosModel insumosModel);
 	
 	//borrar
      public boolean eliminarDatoInsumos(Integer id);
}

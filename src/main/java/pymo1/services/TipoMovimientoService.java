package pymo1.services;



import java.util.ArrayList;

import pymo1.models.TipoMovimiento;



public interface TipoMovimientoService {
	
	ArrayList<TipoMovimiento> obtenerDatosMovimiento();

     //guarda datos en sql
	TipoMovimiento guardarDatosMovimiento(TipoMovimiento tipoMovimiento);
 	
 	//borrar
      public boolean eliminarDatoMovimiento(Integer id);
}

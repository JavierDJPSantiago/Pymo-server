package pymo1.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "insumos")
public class InsumosModel{
	
	@Id
	@GeneratedValue
	@Column(unique = true, nullable = false)
	private Integer id;

	@Column(nullable = false)
	private Integer numero_cantidad;

	@Column(nullable = false, length = 256)
	private String fecha;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY) 
	private BodegaModel bodegaModel;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY) 
	private HospitalModel hospitalModel;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY) 
	private TipoMovimiento tipoMovimiento;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY) 
	private ProductoModel productoModel;
	

	
	// Constructor
		public InsumosModel() {
		
	}

	
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getNumero_cantidad() {
			return numero_cantidad;
		}

		public void setNumero_cantidad(Integer numero_cantidad) {
			this.numero_cantidad = numero_cantidad;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		@Override
		public String toString() {
			return "InsumosModel [id=" + id + ", numero_cantidad=" + numero_cantidad + ", fecha=" + fecha + "]";
		}
		


		
	

}

package pymo1.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bodega")
public class BodegaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;

	@Column(nullable = false)
	private Integer cantidad;

	@OneToMany(mappedBy = "bodega")
    private List<ProductoModel> productoModel;
	
	@OneToMany(mappedBy = "bodega")
    private List<InsumosModel> insumosModel;
	
	// Constructor
		public BodegaModel() {
		
	}


		


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public Integer getCantidad() {
			return cantidad;
		}


		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}
		
		@Override
		public String toString() {
			return "BodegaModel [id=" + id + ", cantidad=" + cantidad + "]";
		}


		
	

}

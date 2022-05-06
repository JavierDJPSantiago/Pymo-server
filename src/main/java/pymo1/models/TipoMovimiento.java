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
@Table(name = "movimiento")
public class TipoMovimiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;

	@Column(nullable = false, length = 256)
	private String descripcion;

	@OneToMany(mappedBy = "movimiento")
    private List<InsumosModel> insumosModel;
	
	// Constructor
		public TipoMovimiento() {
		
	}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getDescripcion() {
			return descripcion;
		}


		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}


		@Override
		public String toString() {
			return "TipoMovimiento [id=" + id + ", descripcion=" + descripcion + "]";
		}

	

}

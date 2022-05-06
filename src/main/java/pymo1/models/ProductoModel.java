package pymo1.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "producto")
public class ProductoModel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;

	@Column(nullable = false, length = 256)
	private String nombre;

	@Column(nullable = false, length = 256)
	private String descripcion;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY) 
	private BodegaModel bodegaModel;
	
	@OneToMany(mappedBy = "producto")
    private List<InsumosModel> insumosModel;
	

	// Constructor
		public ProductoModel() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "ProductoModel [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}	
	

}

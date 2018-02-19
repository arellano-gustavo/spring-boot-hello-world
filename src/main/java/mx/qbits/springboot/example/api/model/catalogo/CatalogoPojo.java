/*
 * Licencia:    Este código se encuentra bajo la protección
 *              que otorga el contrato establecido entre
 *              Interware SA de CV y su cliente, Salud Cercana por lo
 *              que queda estrictamente prohibido copiar, donar
 *              vender y/o distribuir el presente código por
 *              cualquier medio electrónico o impreso sin el
 *              permiso explícito y por escrito del cliente.
 *
 * Proyecto:    SaludCercana
 * Paquete:     com.sc.api.model.dto
 * Modulo:      CatalogoPojo
 * Tipo:        clase
 * Autor:       Héctor Avila
 * Fecha:       20 junio 2016
 * Version:     0.0.1
 * .
 * POJO Asociado a la Vista vw_catalogos que obtiene genericamente cualquier catalogo
 *
 *
 *
 */
package mx.qbits.springboot.example.api.model.catalogo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

public class CatalogoPojo implements Serializable {

	private static final long serialVersionUID = -5186536699729038148L;

	@JsonIgnore
	private String idCatalogo;
	private int id;
	private String valor;
	private String descripcion;

	@JsonIgnore
	private String nombreTabla;

	@JsonIgnore
	private Integer estatus;

	private Long registros;

	public CatalogoPojo() {
	}

	public CatalogoPojo(int id, String valor, String descripcion, String nombreTabla) {
		this.id = id;
		this.valor = valor;
		this.descripcion = descripcion;
		this.nombreTabla = nombreTabla;
	}

	/**
	 * Construye una instancia de catalogo genérico a partir de un enum que
	 * funciona como catálogo.
	 *
	 * @param c Enum tipo catálogo.
	 */
	public CatalogoPojo(CatalogoPojo c) {
		this.id = c.getId();
		this.valor = c.getValor();
		this.descripcion = c.getDescripcion();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(String idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreTabla() {
		return nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + id;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		CatalogoPojo other = (CatalogoPojo) obj;
		if(descripcion == null) {
			if(other.descripcion != null)
				return false;
		} else if(!descripcion.equals(other.descripcion))
			return false;
		if(id != other.id)
			return false;
		if(valor == null) {
			if(other.valor != null)
				return false;
		} else if(!valor.equals(other.valor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append(" id: ").append(id)
				.append(" valor: ").append(valor)
				.append(" descripcion: ").append(descripcion)
				.append(" nombre tabla: ").append(nombreTabla)
				.toString();
	}

	public Long getRegistros() {
		return registros;
	}

	public void setRegistros(Long registros) {
		this.registros = registros;
	}
}

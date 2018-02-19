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
 * Modulo:      Estado
 * Tipo:        clase
 * Autor:       alvaro.salas
 * Fecha:       21 junio 2016
 * Version:     0.0.1
 *
 *
 */
package mx.qbits.springboot.example.api.model.archivo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

public class ArchivoPojo implements Serializable {
  private static final long serialVersionUID = -5186536699729038148L;
  @JsonIgnore
  private Integer id;
  private String nombre;
  private String nombreOriginal;
  private String url;
  private String tipo;

  /**
   * Constructor sin parametros.
   */
  public ArchivoPojo() {
  }

  /**
   * Constrictor.
   * @param id identificador
   * @param nombre nombre generado
   * @param nombreOriginal nombre original de archivo
   * @param url url
   * @param tipo tipo de archivo segun ssu extencion
   */
  public ArchivoPojo(Integer id, String nombre, String nombreOriginal, String url, String tipo) {
    this.id = id;
    this.nombre = nombre;
    this.nombreOriginal = nombreOriginal;
    this.url = url;
    this.tipo = tipo;
  }

  /**
   * getId.
   * @return integer
   */
  public Integer getId() {
    return id;
  }

  /**
   * setId.
   * @param id identificador
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * getNombre.
   * @return nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * setNombre.
   * @param nombre nombre
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * getUrl.
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * setUrl.
   * @param url ulr
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * getTipo.
   * @return tipo
   */
  public String getTipo() {
    return tipo;
  }

  /**
   * setTipo.
   * @param tipo tipo
   */
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  /**
   * getNombreOriginal.
   * @return nombreOriginal
   */
  public String getNombreOriginal() {
    return nombreOriginal;
  }

  /**
   * setNombreOriginal.
   * @param nombreOriginal nombreOriginal
   */
  public void setNombreOriginal(String nombreOriginal) {
    this.nombreOriginal = nombreOriginal;
  }
}


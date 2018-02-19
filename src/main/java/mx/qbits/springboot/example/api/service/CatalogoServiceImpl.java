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
 * Paquete:     com.sc.api.service
 * Modulo:      CatalogoServiceImpl
 * Tipo:        clase
 * Autor:       Héctor Avila
 * Fecha:       20 junio 2016
 * Version:     0.0.1
 *
 *Clase para obtener los catálogos
 *
 *
 *
 */
package mx.qbits.springboot.example.api.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import mx.qbits.springboot.example.api.model.catalogo.CatalogoPojo;
import mx.qbits.springboot.example.api.model.catalogo.CatalogoResponse;

/**
 * CatalogoService.
 *
 * @author havila
 */
@Service
public class CatalogoServiceImpl implements CatalogoService {

  private static final Logger LOG = Logger.getLogger(CatalogoServiceImpl.class);

  /**
   * <h1> Obtiene arreglo de catálogos </h1>.
   *
   * @param listaCat <p>Recibe una lista de catálogos (String's) </p>
   *
   * @return CatalogoResponse <p>Regresa arreglos de catálogos</p>
   */
  @Override
  public CatalogoResponse getCatalogos(List<String> listaCat) {
    return null;
  }

  /**
   * Método para obtener un valor de acuerdo al nombre del catálogo y su valor.
   *
   * @param nombreTabla nombre de la tabla
   * @param valor       valor del catalogo
   *
   * @return CatalogoPojo
   */
  @Override
  public CatalogoPojo getCatalogoByValor(String nombreTabla, String valor) {
    return null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CatalogoPojo getCatalogoById(String nombreTabla, int valor) {
    return null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Map getCatAdministrables() {
      return null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Map findCat(String toke, String catalogo, String estatus) {
    return null;
  }

}

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
 * Paquete:     com.sc.api.model.pojo
 * Modulo:      CatalogoService
 * Tipo:        interfaz
 * Autor:       Héctor Avila
 * Fecha:       20 junio 2016
 * Version:     0.0.1
 *
 *Interfaz de servicios de catalogos
 *
 *
 *
 */
package mx.qbits.springboot.example.api.service;

import java.util.List;
import java.util.Map;

import mx.qbits.springboot.example.api.model.catalogo.CatalogoPojo;
import mx.qbits.springboot.example.api.model.catalogo.CatalogoResponse;

/**
 * CatalogoService.
 *
 * @author havila
 */
public interface CatalogoService {
  /**
   * Método para obtener una lista de catálogos disponibles.
   *
   * @param listaCat lista de catalogos ah obtener
   *
   * @return CatalogoResponse
   */
  CatalogoResponse getCatalogos(List<String> listaCat);

  /**
   * Método para obtener un valor de acuerdo al nombre del catálogo y su valor.
   *
   * @param nombreTabla nombre de la tabla
   * @param valor       valor del catalogo
   *
   * @return CatalogoPojo
   */
  CatalogoPojo getCatalogoByValor(String nombreTabla, String valor);

  /**
   * Método para obtener un valor de acuerdo al nombre del catálogo y su valor.
   *
   * @param nombreTabla nombre de la tabla
   * @param valor       valor del catalogo
   *
   * @return CatalogoPojo
   */
  CatalogoPojo getCatalogoById(String nombreTabla, int valor);

  /**
   * Mapa de catálogos administrables.
   *
   * @return Mapa
   */
  Map getCatAdministrables();

  /**
   * Buscador de opciones de catálogos.
   *
   * @param token    token de usuario
   * @param catalogo nombre del catalogo
   * @param estatus  estatus de las opciones
   *
   * @return Mapa
   */
  Map findCat(String token, String catalogo, String estatus);

}

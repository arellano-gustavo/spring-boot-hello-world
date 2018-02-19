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
 * Paquete:     com.sc.api.rest
 * Modulo:      CatalogoController
 * Tipo:        clase
 * Autor:       Héctor E. Avila Meléndez
 * Fecha:       Tuesday 05 de Jun de 2016 (21_24)
 * Version:     0.0.1
 * .
 * Controller para obtener los catalogos
 *
 * Historia:    .
 *              20160524_2124 Generado por GOOSE
 *              20160822_1141 Se agrega documentación Swagger y se corrigen errores detectados en JavaDoc GAA
 *
 */
package mx.qbits.springboot.example.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mx.qbits.springboot.example.api.model.catalogo.CatalogoEnum;
import mx.qbits.springboot.example.api.model.catalogo.CatalogoRequest;
import mx.qbits.springboot.example.api.model.catalogo.CatalogoResponse;
import mx.qbits.springboot.example.api.service.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * Controller para obtener los catalogos.
 *
 * @author garellano
 */
@RestController
@Api(value = "catalogo")
@RequestMapping(value = "/api/catalogo")
public class CatalogoController {
  @Autowired
  private CatalogoService catalogoService;

  /**
   * Realiza una petición a los catalogos Retorna un areglo de los catálogos existentes.
   *
   * @return CatalogoEnum[]
   */
  @ApiOperation(
      value = "CatalogoController::getAll",
      notes = "Regresa un arreglo de todos los catálogos del sistema")
  @RequestMapping(
      value = "/all.json",
      method = GET,
      produces = "application/json; charset=utf-8")
  public CatalogoEnum[] getAll() {
    return CatalogoEnum.values();
  }

  /**
   * Realiza una busqueda(vw_catalogos) de los catálogos requeridos Retorna un arreglo de los catálogos requeridos.
   *
   * @param catalogoRequest peticion que contiene un arreglo de nombres de catalogo.
   *
   * @return CatalogoResponse
   */
  @ApiOperation(
      value = "CatalogoController::getCatalogos",
      notes = "Recibe un arreglo de strings, cada string representa un catálogo del sistema. Regresa la lista de"
          + " catálogos solicitados con sus posibles valores")
  @RequestMapping(
      value = "/catalogo.json",
      method = POST,
      produces = "application/json; charset=utf-8")
  public CatalogoResponse getCatalogos(
      @RequestBody CatalogoRequest catalogoRequest) {
    return catalogoService.getCatalogos(catalogoRequest.getCatalogos());
  }

  /**
   * Realiza una petición a los catalogos Retorna un areglo de los catálogos existentes.
   *
   * @return Mapa
   */
  @ApiOperation(
      value = "CatalogoController::getAdministrables",
      notes = "Regresa un arreglo de todos los catálogos administrables del sistema")
  @RequestMapping(
      value = "/administrables.json",
      method = GET,
      produces = "application/json; charset=utf-8")
  public Map getAdministrables() {
    return catalogoService.getCatAdministrables();
  }

  /**
   * Busca las opciones de un catalogo.
   *
   * @param token    token de usuario
   * @param catalogo valor del catalogo
   * @param estatus  filtros de estados
   *
   * @return GenericResponse
   */
  @ApiOperation(
      value = "CatalogoController::find",
      notes = "Busca las opciones de catálogo de acuerdo al catálogo recibido, también permite filtrar por estatus"
          + " del catálogo.")
  @RequestMapping(
      value = "/find.json",
      method = GET,
      produces = "application/json; charset=utf-8")
  public Map findCat(
      @RequestHeader(value = "X-Auth-Token") String token,
      @RequestParam String catalogo,
      @RequestParam(required = false, defaultValue = "") String estatus
                    ) {
    return catalogoService.findCat(token, catalogo, estatus);
  }

}

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
 * Modulo:      ArchivoController
 * Tipo:        clase
 * Autor:       Alvaro Enrique Salas Mtz (AESM)
 * Fecha:       Tuesday 13 de junio de 2016 (21_24)
 * Version:     0.0.1
 * .
 * Controller para la administración de Archivos
 *
 * Historia:    .
 *              20160613_2124 Generado por AESM
 *              20160822_1141 Se agrega documentación Swagger y se corrigen errores detectados en JavaDoc GAA
 *
 *
 */
package mx.qbits.springboot.example.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import mx.qbits.springboot.example.api.service.ArchivoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * <p>
 * Esta clase representa al servicio REST que obtiene un archivo
 * dado su nombre y lo coloca en el HttpServletResponse.
 * </p>
 *
 * @author gustavo
 */
@RestController
@Api(value = "archivo")
@RequestMapping("/api/archivo")
public class ArchivoController {
  @Autowired
  private ArchivoService archivoService;

  /**
   * Obtiene un archivo dado su nombre y lo coloca en el HttpServletResponse.
   *
   * @param nombreArchivo    Nombre del archivo a recuperar
   * @param extensionArchivo Extension del archivo a recuperar
   * @param response         Response donde se colocara el archivo para responder en http
   */
  @ApiOperation(
      value = "ArchivoController::getArchivo",
      notes = "Obtiene un archivo dado su nombre.")
  @RequestMapping(
      value = "/{nombreArchivo}.{extensionArchivo}",
      method = GET)
  public void getArchivo(
      @ApiParam(name = "nombreArchivo", value = "Parámetro 'nombreArchivo' usado en esta API", required = true)
      @PathVariable String nombreArchivo,
      @ApiParam(name = "extensionArchivo", value = "Parámetro 'extensionArchivo' usado en esta API", required = true)
      @PathVariable String extensionArchivo) {
    //TODO Implementar llamada de servicio
  }

}

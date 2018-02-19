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
 * Paquete:     com.sc.support.mail
 * Modulo:      sc
 * Tipo:        AppSC
 * Autor:       Gustavo Adolfo Arellano Sandoval (GAA)
 * Fecha:       Miercoles 01 de Junio de 2016 (21_24)
 * Version:     0.0.1
 * .
 * Clase que arranca la aplicación
 *
 * Historia:    .
 *
 *
 */
package mx.qbits.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>AppSC class.</p>
 *
 * @author garellano
 * @version $Id: $Id
 */
@SpringBootApplication
@ComponentScan("mx.qbits.springboot.example")
public class AppSC {

  /**
   * <p>main.</p>
   *
   * @param args an array of {@link java.lang.String} objects.
   */
  public static void main(String[] args) {
    SpringApplication.run(AppSC.class, args);
  }

}

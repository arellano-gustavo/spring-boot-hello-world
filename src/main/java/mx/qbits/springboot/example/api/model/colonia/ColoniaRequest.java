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
 * Modulo:      CatalogoRequest
 * Tipo:        clase
 * Autor:       Héctor Avila
 * Fecha:       20 junio 2016
 * Version:     0.0.1
 *
 *Clase utilizada para recibir un arreglos de catálogos en tipo String
 *
 *
 *
 */
package mx.qbits.springboot.example.api.model.colonia;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ColoniaRequest {

    @JsonProperty("colonias")
    private List<ColoniaPojo> coloniaPojo = new ArrayList<>();

    public ColoniaRequest() {
    }

    public ColoniaRequest(List<ColoniaPojo> coloniaPojo) {
        this.coloniaPojo = coloniaPojo;
    }

    public List<ColoniaPojo> getColoniaPojo() {
        return coloniaPojo;
    }

    public void setColoniaPojo(List<ColoniaPojo> coloniaPojo) {
        this.coloniaPojo = coloniaPojo;
    }
}

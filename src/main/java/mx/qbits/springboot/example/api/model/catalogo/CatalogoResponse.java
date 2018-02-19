package mx.qbits.springboot.example.api.model.catalogo;
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
 * Modulo:      CatalogoResponse
 * Tipo:        clase
 * Autor:       Héctor Avila
 * Fecha:       20 junio 2016
 * Version:     0.0.1
 *
 *Clase utilizada para regresar la Lista de catálogos
 *
 *
 *
 */

import java.util.HashMap;
import java.util.List;

public class CatalogoResponse {

    //TODO verificar si se puede colocar el generic para estos Enums y eliminar el @SuppressWarnings("rawtypes")

    //catalogos
    @SuppressWarnings("rawtypes")
    private HashMap<Enum, List<CatalogoPojo>> catalogos = new HashMap<>();

    public CatalogoResponse() {
    }

    @SuppressWarnings("rawtypes")
    public CatalogoResponse(HashMap<Enum, List<CatalogoPojo>> catalogos) {
        this.catalogos = catalogos;
    }

    @SuppressWarnings("rawtypes")
    public HashMap<Enum, List<CatalogoPojo>> getCatalogos() {
        return catalogos;
    }

    @SuppressWarnings("rawtypes")
    public void setCatalogos(HashMap<Enum, List<CatalogoPojo>> catalogos) {
        this.catalogos = catalogos;
    }
}

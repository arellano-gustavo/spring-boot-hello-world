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
 * Paquete:     com.sc.api.model.enums
 * Modulo:      CatalogoEnum
 * Tipo:        clase
 * Autor:       Héctor Avila
 * Fecha:       20 junio 2016
 * Version:     0.0.1
 *
 * Enum que enlista los catalogos existentes en el proyecto.
 *
 *
 *
 */
package mx.qbits.springboot.example.api.model.catalogo;

/**
 * Created by havila on 8/06/16.
 */
public enum CatalogoEnum {
    cat_estatus_pago("cat_estatus_pago"),
    cat_plan_paciente("cat_plan_paciente"),
    cat_categoria_sitio("cat_categoria_sitio"),
    cat_paciente_plan_estatus("cat_paciente_plan_estatus"),
    cat_plan_venta("cat_plan_venta"),
    cat_plan_salud("cat_plan_salud"),
    cat_plan_salud_activos("cat_plan_salud_activos"),
    cat_microseguro("cat_microseguro"),
    cat_genero("cat_genero"),
    cat_rol("cat_rol"),
    cat_rol_paciente("cat_rol_paciente"),
    cat_estatus_registro("cat_estatus_registro"),
    cat_estatus("cat_estatus"),
    cat_area_estudio("cat_area_estudio"),
    cat_area_experiencia("cat_area_experiencia"),
    cat_certificacion("cat_certificacion"),
    cat_diagnostico("cat_diagnostico"),
    cat_dosis("cat_dosis"),
    cat_duracion("cat_duracion"),
    cat_entidad_habiencia("cat_entidad_habiencia"),
    cat_estado_civil("cat_estado_civil"),
    cat_estudio_laboratorio("cat_estudio_laboratorio"),
    cat_frecuencia("cat_frecuencia"),
    cat_horario_atencion("cat_horario_atencion"),
    cat_indicacion("cat_indicacion"),
    cat_instituto_alianza("cat_instituto_alianza"),
    cat_medicamento("cat_medicamento"),
    cat_nivel_estudios("cat_nivel_estudios"),
    cat_notificacion("cat_notificacion"),
    cat_pais("cat_pais"),
    cat_periodo_cobro("cat_periodo_cobro"),
    cat_pregunta_frecuente("cat_pregunta_frecuente"),
    cat_referencia("cat_referencia"),
    cat_servicio_cliente("cat_servicio_cliente"),
    cat_tiempo_experiencia("cat_tiempo_experiencia"),
    cat_tipo_documento("cat_tipo_documento"),
    cat_via_administracion("cat_via_administracion"),
    cat_zona("cat_zona"),
    cat_cp("cat_cp"),
    cat_zona_cp("cat_zona_cp"),
    cat_estatus_paciente_plan("cat_estatus_paciente_plan"),
    cat_estatus_notificacion("cat_estatus_notificacion"),
    cat_enviar_a("cat_enviar_a");

    String cat_text;

    CatalogoEnum() {
    }

    CatalogoEnum(String cat_text) {
        this.cat_text = cat_text;
    }

    public String getCat_text() {
        return cat_text;
    }

}

package mx.qbits.springboot.example.api.model.colonia;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by havila on 21/06/16.
 */
public class ColoniaPojo {

    @JsonProperty("id")
    private int id;

    @JsonProperty("valor")
    private String valor;

    @JsonProperty("idCatDelegacion")
    private int idCatDelegacion;

    @JsonProperty("cp")
    private String idCp;

    public ColoniaPojo() {
    }

    public ColoniaPojo(int id, String valor, int idCatDelegacion, String idCp) {
        this.id = id;
        this.valor = valor;
        this.idCatDelegacion = idCatDelegacion;
        this.idCp = idCp;
    }
}

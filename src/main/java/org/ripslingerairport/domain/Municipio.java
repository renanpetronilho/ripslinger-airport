package org.ripslingerairport.domain;

import java.io.Serializable;

/**
 * Created by renanpetronilho on 29/10/16.
 */
public class Municipio implements Serializable {

    private Long codigoIbge;

    private String descricao;

    private Estado estado;

    public Municipio() {
    }

    public Long getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(Long codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "codigoIbge=" + codigoIbge +
                ", descricao='" + descricao + '\'' +
                ", estado=" + estado +
                '}';
    }
}

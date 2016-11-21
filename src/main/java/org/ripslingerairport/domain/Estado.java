package org.ripslingerairport.domain;

import java.io.Serializable;

/**
 * Created by renanpetronilho on 01/10/16.
 */
public class Estado implements Serializable {

    private Long codigoIbge;

    private String descricao;

    private String sigla;

    public Estado() {
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "codigoIbge=" + codigoIbge +
                ", descricao='" + descricao + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}

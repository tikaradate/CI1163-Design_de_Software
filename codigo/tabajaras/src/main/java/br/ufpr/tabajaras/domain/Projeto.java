package br.ufpr.tabajaras.domain;

import lombok.Data;

@Data
public class Projeto {
    private String nome;
    private Integer numeroCobranca;
    
    public Integer getNumeroCobranca() {
        return numeroCobranca;
    }
}

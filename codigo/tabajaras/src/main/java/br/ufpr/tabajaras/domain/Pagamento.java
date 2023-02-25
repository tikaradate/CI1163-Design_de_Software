package br.ufpr.tabajaras.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Pagamento {
    private Date dia;
    private Float valor;
}

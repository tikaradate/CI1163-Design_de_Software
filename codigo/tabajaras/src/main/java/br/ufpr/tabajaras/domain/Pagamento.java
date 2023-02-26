package br.ufpr.tabajaras.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Pagamento {
    private Date dia;
    private BigDecimal valor;

    public String getInfoPag(Funcionario func) {
        // implementation
        return null;
    }

    // getter and setter methods
    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
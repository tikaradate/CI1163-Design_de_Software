package br.ufpr.tabajaras.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Pagamento {
    private Date dia;
    private BigDecimal valor;

    public Pagamento getInfoPag(Funcionario func) {
    	Pagamento p = new Pagamento();
    	p.setDia(new Date());
    	p.setValor(new BigDecimal("1000"));
    	return p;
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
package br.ufpr.tabajaras.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Ponto {


    private Date inicio;
    private Date fim;

    public Ponto getInfoPonto(Funcionario func) {
    	Ponto p = new Ponto();
    	p.setInicio(new Date());
    	p.setFim(new Date());
        
        return p;
    }

    private void criaPonto(Funcionario func, Date dataIni, Date dataFim) {
    	Ponto p = new Ponto();
    	p.setInicio(dataIni);
    	p.setFim(dataFim);
    }
}
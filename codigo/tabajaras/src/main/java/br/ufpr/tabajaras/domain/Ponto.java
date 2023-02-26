package br.ufpr.tabajaras.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Ponto {


    private Date inicio;
    private Date fim;

    public Ponto getInfoPonto(Funcionario func) {
        // Retorna as informações de ponto do funcionário
        return null;
    }

    private void criaPonto(Funcionario func, Date dataIni, Date dataFim) {
        // Cria um novo registro de ponto para o funcionário com as datas fornecidas
    }
}
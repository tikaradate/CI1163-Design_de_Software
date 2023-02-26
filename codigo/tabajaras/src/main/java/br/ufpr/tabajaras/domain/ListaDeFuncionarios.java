package br.ufpr.tabajaras.domain;

import java.util.List;

import lombok.Data;

@Data
public class ListaDeFuncionarios {
    private List<Funcionario> funcionarios;

    public Info retornaFuncionarioInfos(Funcionario func) {
        // Implementação aqui
        return null;
    }

    public void adicionaFunc(Funcionario func) {
        // Implementação aqui
    }

    public Funcionario buscaFunc(Integer ID) {
        // Implementação aqui
        return null;
    }

    public void alterarInformacoes(Funcionario func) {
        // Implementação aqui
    }

    public void excluiFuncionario(Funcionario func) {
        // Implementação aqui
    }
}
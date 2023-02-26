package br.ufpr.tabajaras.domain;

import lombok.Data;

@Data
public class Funcionario {
    private String nome;
    private TiposPagamentoEnum tipoPagamento;
    
    public void inserirInformacoes(String nome, String senha) {
        // Implementação aqui
    }
    
    public void enviarEndereco(String endereco) {
        // Implementação aqui
    }
    
    public void enviarInformacoesBanco(String nome, Integer numero) {
        // Implementação aqui
    }
    
    public void atualizar(Info infos) {
        // Implementação aqui
    }
    
    public void gerarRelatorioFuncionario() {
        // Implementação aqui
    }
    
    public Info getInfos() {
        // Implementação aqui
        return null;
    }
    
    public void iniciarLogin() {
        // Implementação aqui
    }
    
    public void cancelarLogin() {
        // Implementação aqui
    }
    
    public void escolherMetodo() {
        // Implementação aqui
    }
    
    private void registrarUsuario(String nome, String senha) {
        // Implementação aqui
    }
    
    private void validarUsuario(String nome, String senha) {
        // Implementação aqui
    }
}

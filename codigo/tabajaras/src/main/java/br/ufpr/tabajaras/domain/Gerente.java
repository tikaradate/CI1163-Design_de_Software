package br.ufpr.tabajaras.domain;

import lombok.Data;

@Data
public class Gerente{

    public void entrar() {
        // código para permitir o login do gerente
    }
    
    public void solicitarRelatorioAdministrativo() {
        // código para solicitar um relatório administrativo
    }
    
    public void manterInformacoesUsuario() {
        // código para permitir que o gerente mantenha suas informações de usuário
    }
    
    public void gerenciarInformacoes() {
        // código para permitir que o gerente gerencie as informações dos funcionários
    }
    
    public String getHorasFun(Funcionario func) {
        // código para obter as horas trabalhadas de um funcionário
        return "";
    }
    
}
package br.ufpr.tabajaras.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Empresa {
    private List<String> numerosCobranca;

    public String criarRelatorioAdministrativo(TipoRelatorioEnum tipoRelat, Date dataIni, Date dataFim, List<Funcionario> funcionarios) {
        // Implementação da criação do relatório administrativo
        return null;
    }

    public List<Integer> getNumerosCobranca() {
        // Implementação do método para obter números de cobrança
        return null;
    }

    public String forneceNumeroCobranca(Integer numeroCobranca) {
        // Implementação do método para fornecer número de cobrança
        return null;
    }

    public void confirmaAcao() {
        // Implementação do método para confirmar ação
    }

    private void descartaRelatorio() {
        // Implementação do método para descartar relatório
    }

    public void cancelar() {
        // Implementação do método para cancelar ação
    }

    public void confirmar() {
        // Implementação do método para confirmar ação
    }

    public void salvarRelatorio() {
        // Implementação do método para salvar relatório
    }

    public void forneceInformacoesSalvar(String nome, String local) {
        // Implementação do método para fornecer informações de salvamento
    }

    public void confirmaSalvar() {
        // Implementação do método para confirmar salvamento
    }

    public void adicionarFuncionario() {
        // Implementação do método para adicionar funcionário
    }

    public void atualizarFuncionario() {
        // Implementação do método para atualizar funcionário
    }

    public void excluirFuncionario() {
        // Implementação do método para excluir funcionário
    }

    public void inserirInformacoes(String nome, TipoFuncionarioEnum tipoFun, String endereco, Deducoes deducoes, String tel, Integer taxaHora, BigDecimal salario, Integer taxaComissao, Integer limiteHoras) {
        // Implementação do método para inserir informações do funcionário
    }

    private Funcionario geraFuncionario(String nome, TipoFuncionarioEnum tipoFun, String endereco, Deducoes deducoes, String tel, Integer taxaHora, BigDecimal salario, Integer taxaComissao, Integer limiteHoras, Integer id) {
        // Implementação do método para gerar um novo funcionário
        return null;
    }

    public Funcionario inserirIDFuncionario(Integer ID) {
        // Implementação do método para inserir o ID do funcionário
        return null;
    }

    public void alterarInformacoes(Funcionario func) {
        // Implementação do método para alterar informações do funcionário
    }

    private void marcarExclusaoFuncionario(Funcionario func) {
        // Implementação do método para marcar exclusão do funcionário
    }

    public void insereHoras(Date horas) {
        // Implementação do método para inserir horas de trabalho do funcionário
    }
}

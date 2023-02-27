package br.ufpr.tabajaras.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Empresa {
    private static List<String> numerosCobranca;
    
    public static List<String> getNumerosCobranca() {
    	return numerosCobranca;
    }

    public String criarRelatorioAdministrativo(TipoRelatorioEnum tipoRelat, Date dataIni, Date dataFim, List<Funcionario> funcionarios) {
        String relatorio = "";
        ListaDeFuncionarios ldf = new ListaDeFuncionarios();
        for(Funcionario func : funcionarios){
            relatorio += ldf.retornaFuncionarioInfos(func);
        }
        return relatorio;
    }


    public static String forneceNumeroCobranca(Integer numeroCobranca) {
        return numerosCobranca.get(numeroCobranca);
    }

    public void confirmaAcao() {
        this.confirmar();
    }

    private void descartaRelatorio() {
    	System.out.println("Relatorio descartado");
    }

    public void cancelar() {
        this.descartaRelatorio();
    }

    public void confirmar() {
        System.out.println("Relatorio salvo");
    }

    public void salvarRelatorio() {
        System.out.println("Deseja salvar o relatorio?");
    }

    public void forneceInformacoesSalvar(String nome, String local) {
        System.out.println("Esta função fornece informações de salvamento com base no nome e local fornecidos.");
    }

    public void confirmaSalvar() {
        System.out.println("Esta função confirma o salvamento de informações.");
    }

    public void adicionarFuncionario() {
        System.out.println("Esta função é usada para adicionar um novo funcionário.");
    }

    public void atualizarFuncionario() {
        System.out.println("Esta função é usada para atualizar informações de um funcionário existente.");
    }

    public void excluirFuncionario() {
        System.out.println("Esta função é usada para excluir um funcionário.");
    }

    public void inserirInformacoes(String nome, TipoFuncionarioEnum tipoFun, String endereco, Deducoes deducoes, String tel, Integer taxaHora, BigDecimal salario, Integer taxaComissao, Integer limiteHoras) {
        System.out.println("Esta função é usada para inserir informações do funcionário, como nome, tipo, endereço, deduções, telefone, taxa por hora, salário, taxa de comissão e limite de horas.");
    }

    private Funcionario geraFuncionario(String nome, TipoFuncionarioEnum tipoFun, String endereco, Deducoes deducoes, String tel, Integer taxaHora, BigDecimal salario, Integer taxaComissao, Integer limiteHoras, Integer id) {
        System.out.println("Esta função é usada para gerar um novo funcionário com base nas informações fornecidas, como nome, tipo, endereço, deduções, telefone, taxa por hora, salário, taxa de comissão, limite de horas e ID.");
        return null;
    }

    public Funcionario inserirIDFuncionario(Integer ID) {
        System.out.println("Esta função é usada para inserir o ID de um funcionário existente.");
        return null;
    }

    public void alterarInformacoes(Funcionario func) {
        System.out.println("Esta função é usada para alterar informações de um funcionário existente.");
    }

    private void marcarExclusaoFuncionario(Funcionario func) {
        System.out.println("Esta função é usada para marcar um funcionário para exclusão.");
    }

    public void insereHoras(Date horas) {
        System.out.println("Esta função é usada para inserir as horas trabalhadas de um funcionário.");
    }

}

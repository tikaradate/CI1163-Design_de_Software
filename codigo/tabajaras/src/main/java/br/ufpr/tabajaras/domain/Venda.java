package br.ufpr.tabajaras.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

    private BigDecimal valor;
    private List<Integer> ordensDeCompra = new ArrayList<>();

    public void criarOrdem() {
        // implementação
    }

    public Integer inserirInformacoesOrdem(String contatoCliente, String enderecoCobranca, String produto, Date data) {
        return null;
    }

    public void alterarOrdem() {
    }

    public void inserirIDOrdemDeCompra(Integer idOrdemDeCompra) {
    }

    public void cancelar() {
        // implementação
    }

    public void confirmar() {
        // implementação
    }

    private Integer geraOrdem(String contatoCliente, String enderecoCobranca, String produto, Date data) {
        return null;
    }

    private void adicionaOrdem(Integer numero, FuncionarioComissionado funcC) {
    }

    private void procura(Integer idOrdemDeCompra) {
    }

    private void atualizaOrdem(String contatoCliente, String enderecoCobranca, String produto, Date data) {
    }

    private void remove(Integer idOrdemCompra) {
    }

}

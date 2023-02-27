package br.ufpr.tabajaras.domain;

import java.math.BigDecimal;

public class FolhaDePagamento {
	public void executarFolhaPagamento() {
	    // Implementação da lógica de execução da folha de pagamento
	    System.out.println("Executa a lógica de execução da folha de pagamento.");
	}

	public Integer calculaPagamento(BigDecimal pagFun) {
	    // Implementação da lógica de cálculo do pagamento do funcionário
	    System.out.println("Calcula o pagamento do funcionário com base em um valor fornecido.");
	    return 0;
	}

	public void enviaTransacao(Integer trans) {
	    // Implementação da lógica de envio da transação
	    System.out.println("Envia uma transação com base em um número de transação fornecido.");
	}

}
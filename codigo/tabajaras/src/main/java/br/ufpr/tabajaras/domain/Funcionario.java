package br.ufpr.tabajaras.domain;

import java.util.List;

import lombok.Data;

@Data
public class Funcionario {

	private String nome;
	private TiposPagamentoEnum tipoPagamento;

	public void inserirInformacoes(String nome, String senha) {
	}

	public void enviarEndereco(String endereco) {
	}

	public void enviarInformacoesBanco(String nome, Integer numero) {
	}

	public void atualizar(Info infos) {
	}

	public void gerarRelatorioFuncionario(TipoRelatorioEnum tipoRelatorio) {
		if (tipoRelatorio.equals(TipoRelatorioEnum.HORAS_PROJETO)) {
			List<String> nrs = Empresa.getNumerosCobranca();
			String relatorio = Empresa.forneceNumeroCobranca(0);
		}
	}

	public Info getInfos() {
		Info info = new Info();
		Pagamento p = new Pagamento();
		Ponto ponto = new Ponto();
		info.setPagamentoInfo(p.getInfoPag(this));
		info.setPontoInfo(ponto.getInfoPonto(this));
		return info;
	}

	public void iniciarLogin() {
	}

	public void cancelarLogin() {
	}

	public void escolherMetodo() {
	}

	private void registrarUsuario(String nome, String senha) {
	}

	private void validarUsuario(String nome, String senha) {
	}
}

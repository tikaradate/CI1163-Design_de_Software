package br.ufpr.tabajaras.domain;

public class Info {
    private Pagamento pagamentoInfo;
    private Ponto pontoInfo;

    public Info(Pagamento pagamentoInfo, Ponto pontoInfo) {
        this.pagamentoInfo = pagamentoInfo;
        this.pontoInfo = pontoInfo;
    }

    public Pagamento getPagamentoInfo() {
        return pagamentoInfo;
    }

    public void setPagamentoInfo(Pagamento pagamentoInfo) {
        this.pagamentoInfo = pagamentoInfo;
    }

    public Ponto getPontoInfo() {
        return pontoInfo;
    }

    public void setPontoInfo(Ponto pontoInfo) {
        this.pontoInfo = pontoInfo;
    }
}
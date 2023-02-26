package br.ufpr.tabajaras.domain;

import java.math.BigDecimal;

public class Deducoes {
    private BigDecimal IR;
    private BigDecimal INSS;

    public Deducoes(BigDecimal IR, BigDecimal INSS) {
        this.IR = IR;
        this.INSS = INSS;
    }

    public BigDecimal getIR() {
        return IR;
    }

    public void setIR(BigDecimal IR) {
        this.IR = IR;
    }

    public BigDecimal getINSS() {
        return INSS;
    }

    public void setINSS(BigDecimal INSS) {
        this.INSS = INSS;
    }
}
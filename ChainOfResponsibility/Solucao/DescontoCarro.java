package Main.ChainOfResponsibility.Solucao;

import Main.ChainOfResponsibility.Carro;

import java.math.BigDecimal;

public abstract class DescontoCarro {

    protected DescontoCarro proximoDesconto;

    public DescontoCarro(DescontoCarro descontoCarro) {
        this.proximoDesconto = descontoCarro;
    }
    public abstract BigDecimal aplicarDesconto(Carro carro);
}

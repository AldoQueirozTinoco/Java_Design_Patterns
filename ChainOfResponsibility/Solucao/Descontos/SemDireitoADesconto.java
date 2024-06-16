package Main.ChainOfResponsibility.Solucao.Descontos;

import Main.ChainOfResponsibility.Carro;
import Main.ChainOfResponsibility.Marca;
import Main.ChainOfResponsibility.Solucao.DescontoCarro;

import java.math.BigDecimal;

public class SemDireitoADesconto extends DescontoCarro {

    public SemDireitoADesconto(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }
    @Override
    public BigDecimal aplicarDesconto(Carro carro) {
            return BigDecimal.ZERO;
    }
}

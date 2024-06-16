package Main.ChainOfResponsibility.Solucao.Descontos;

import Main.ChainOfResponsibility.Carro;
import Main.ChainOfResponsibility.Marca;
import Main.ChainOfResponsibility.Solucao.DescontoCarro;

import java.math.BigDecimal;

public class DescontoCarroFord extends DescontoCarro {

    public DescontoCarroFord(DescontoCarro proximoDesconto)
    {
        super(proximoDesconto);
    }
    @Override
    public BigDecimal aplicarDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if(Marca.FORD.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(2000));
        }
        else{
            return proximoDesconto.aplicarDesconto(carro);
        }
    }
}

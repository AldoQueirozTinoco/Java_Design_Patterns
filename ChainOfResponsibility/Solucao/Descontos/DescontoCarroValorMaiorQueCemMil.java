package Main.ChainOfResponsibility.Solucao.Descontos;

import Main.ChainOfResponsibility.Carro;
import Main.ChainOfResponsibility.Marca;
import Main.ChainOfResponsibility.Solucao.DescontoCarro;

import java.math.BigDecimal;

public class DescontoCarroValorMaiorQueCemMil extends DescontoCarro {

    public DescontoCarroValorMaiorQueCemMil(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }
    @Override
    public BigDecimal aplicarDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if(carro.getPreco().compareTo(new BigDecimal(100000)) > 0){
            return valorVenda.subtract(new BigDecimal(10000));
        }
        else{
            return proximoDesconto.aplicarDesconto(carro);
        }
    }
}

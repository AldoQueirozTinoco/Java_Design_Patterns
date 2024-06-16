package Main.ChainOfResponsibility.Solucao;

import Main.ChainOfResponsibility.Carro;
import Main.ChainOfResponsibility.Marca;
import Main.ChainOfResponsibility.Solucao.Descontos.DescontoCarroFiat;
import Main.ChainOfResponsibility.Solucao.Descontos.DescontoCarroFord;
import Main.ChainOfResponsibility.Solucao.Descontos.DescontoCarroValorMaiorQueCemMil;
import Main.ChainOfResponsibility.Solucao.Descontos.SemDireitoADesconto;

import java.math.BigDecimal;

public class VendaCarroServiceComChainOfResponsibility {

    public BigDecimal calculaValorVenda(Carro carro){
       DescontoCarro desconto = new DescontoCarroFiat(
               new DescontoCarroFord(
                    new DescontoCarroValorMaiorQueCemMil(
                       new SemDireitoADesconto(null
                       ))));

        return desconto.aplicarDesconto(carro);
    }
}

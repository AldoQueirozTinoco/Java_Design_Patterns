package Main.TemplateMethod.solucao;

import Main.TemplateMethod.Problema.ReparaVeiculoComumService;
import Main.TemplateMethod.Problema.ReparaVeiculoDeLuxoService;
import Main.TemplateMethod.VeiculoParaReparo;

public class TesteRepararVeiculosComTemplateMethod {
    public static void main(String[] args) {

        System.out.println("----------------Luxo-----------------");

        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(50);

        ReparoVeiculoService rpl = new ReparaVeiculoDeLuxoServiceComTemplateMethod(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("----------------Comum-----------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparoVeiculoService rpc = new ReparaVeiculoComumServiceComTemplateMethod(veiculoComum);
        rpc.reparaVeiculo();


    }
}

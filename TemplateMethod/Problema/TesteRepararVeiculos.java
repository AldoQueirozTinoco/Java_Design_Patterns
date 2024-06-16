package Main.TemplateMethod.Problema;

import Main.TemplateMethod.VeiculoParaReparo;

public class TesteRepararVeiculos {
    public static void main(String[] args) {

        System.out.println("----------------Luxo-----------------");

        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(50);

        ReparaVeiculoDeLuxoService rpl = new ReparaVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("----------------Comum-----------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparaVeiculoComumService rpc = new ReparaVeiculoComumService(veiculoComum);
        rpc.reparaVeiculo();


    }
}

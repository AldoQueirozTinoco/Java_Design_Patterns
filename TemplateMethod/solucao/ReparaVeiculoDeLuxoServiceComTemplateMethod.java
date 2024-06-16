package Main.TemplateMethod.solucao;

import Main.TemplateMethod.VeiculoParaReparo;

public class ReparaVeiculoDeLuxoServiceComTemplateMethod extends ReparoVeiculoService {
    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoDeLuxoServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }


    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}


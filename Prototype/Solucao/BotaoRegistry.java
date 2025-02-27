package Main.Prototype.Solucao;

import Main.Prototype.Botao;
import Main.Prototype.Problema.BotaoAmarelo;
import Main.Prototype.Problema.BotaoAzul;
import Main.Prototype.Problema.BotaoVermelho;
import Main.Prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {

    private static BotaoRegistry botaoRegistry;

    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static{
        Botao botaoAmarelo = new BotaoAmarelo();

        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoAzul = new BotaoAzul();

        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoVermelho = new BotaoVermelho();

        botaoVermelho.setCor("Vermelho");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
    }

    public static BotaoRegistry getInstance() {
        if (Objects.isNull(botaoRegistry)){
            botaoRegistry = new BotaoRegistry();
            return botaoRegistry;
        }else{
            return botaoRegistry;
        }


    }
    public static Botao getBotao(String chave){
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave, botao);
    }
}

package Main.Prototype.Solucao;

import Main.Prototype.Botao;
import Main.Prototype.TipoBordaEnum;

public class TesteBotaoPrototype {
    public static void main(String[] args) {
       Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
       System.out.println(botaoVermelho);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);
    botaoAmarelo.setLargura(200);
        System.out.println(botaoAmarelo);

        String chave = "BOTAO_PRETO";
        Botao botaoPreto =new Botao();

        botaoPreto.setCor("Preto");
        botaoPreto.setAltura(30);
        botaoPreto.setLargura(122);
        botaoPreto.setTipoBorda(TipoBordaEnum.FINA);

        BotaoRegistry.addRegistry(chave,botaoPreto);

        Botao botaoPretoClone = BotaoRegistry.getBotao("BOTAO_PRETO");
        System.out.println(botaoPretoClone);
    }
}

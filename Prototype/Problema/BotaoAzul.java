package Main.Prototype.Problema;

import Main.Prototype.Botao;
import Main.Prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {
    public BotaoAzul() {
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}

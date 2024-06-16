package Main.Prototype.Solucao;

import Main.Prototype.Botao;

public class BotaoFactory {

    public static Botao getInstance(Botao prototipo) {
    Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoBorda(prototipo.getTipoBorda());

    return clone;
    }
}

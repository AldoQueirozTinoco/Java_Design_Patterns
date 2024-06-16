package Main.Prototype.Problema;

import Main.Prototype.Botao;
import Main.Prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {

        public BotaoVermelho() {
            setCor("Vermelho");
            setAltura(30);
            setLargura(100);
            setTipoBorda(TipoBordaEnum.FINA);
        }
    }



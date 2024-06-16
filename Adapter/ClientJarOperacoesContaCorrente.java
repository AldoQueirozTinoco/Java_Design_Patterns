package Main.Adapter;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrente {

    private JarOperacoesContaCorrente jocc;
    public ClientJarOperacoesContaCorrente(JarOperacoesContaCorrente jocc) {
        this.jocc = jocc;
    }

    public boolean validaSaldo(BigDecimal valorPretendidoSaque) {
        return jocc.validaSaldo(valorPretendidoSaque);
    }
    public void saca(BigDecimal valorSaque) {
        jocc.saca(valorSaque);
    }
    public void deposita(BigDecimal valorDepositado) {
        jocc.deposita(valorDepositado);
    }
}

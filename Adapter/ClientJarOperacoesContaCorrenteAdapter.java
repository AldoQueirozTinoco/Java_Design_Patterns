package Main.Adapter;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrenteAdapter jarContaAdapter;

    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarContaAdapter) {
        this.jarContaAdapter = jarContaAdapter;
    }

    public void saca(BigDecimal valorSaque) {
        jarContaAdapter.saca(valorSaque);
    }
    public void deposita(BigDecimal valorDepositado) {
        jarContaAdapter.deposita(valorDepositado);
    }
}

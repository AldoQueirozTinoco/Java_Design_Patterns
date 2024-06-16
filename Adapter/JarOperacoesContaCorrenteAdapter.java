package Main.Adapter;

import java.math.BigDecimal;

public class JarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrente jarConta;

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
        this.jarConta = jarConta;
    }

    public void saca(BigDecimal valorPretendido){
        if (jarConta.validaSaldo(valorPretendido)){
        jarConta.saca(valorPretendido);
        }else{
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
    }

    public void deposita(BigDecimal valor){
        jarConta.deposita(valor);
    }
}

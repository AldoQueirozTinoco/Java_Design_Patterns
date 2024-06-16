package Main.Adapter;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {
    public static void main(String[] args) {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(10000);
        if(client.validaSaldo(valorPretendidoParaSaque)){ // O Programa passa a depender da competência do programador
            client.saca(valorPretendidoParaSaque);
        }

    client.deposita(new BigDecimal(500));

   }
}

package Main.Strategy.Problema;

import Main.Strategy.Funcionario;
import Main.Strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class TesteAjusteSalarioSemStrategy {

    public static void main(String[] args) {
        ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();

        Funcionario funcionarioCLT = new Funcionario();

    funcionarioCLT.setNome("Vicky");
    funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
    funcionarioCLT.setSalario(new BigDecimal(500));
    }
}

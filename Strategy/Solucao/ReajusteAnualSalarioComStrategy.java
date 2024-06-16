package Main.Strategy.Solucao;

import Main.Strategy.Funcionario;
import Main.Strategy.Solucao.Calculadoras.CalculadorReajusteAnualSalario;
import Main.Strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalarioComStrategy {
    public void calculaReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {
        calculador.calcularReajusteAnualSalario(funcionario);
    }
}

package Main.Strategy.Solucao;

import Main.Strategy.Funcionario;
import Main.Strategy.Problema.ReajusteAnualSalario;
import Main.Strategy.Solucao.Calculadoras.CalculadorReajusteAnualSalarioCLT;
import Main.Strategy.Solucao.Calculadoras.CalculadorReajusteAnualSalarioPJ;
import Main.Strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class TesteAjusteSalarioComStrategy {
    public static void main(String[] args) {
        ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();

        Funcionario funcionarioCLT = new Funcionario();

        funcionarioCLT.setNome("Nicky");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(500));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Rcky");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());


        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
    }
}

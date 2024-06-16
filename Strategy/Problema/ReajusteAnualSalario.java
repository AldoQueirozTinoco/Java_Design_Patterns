package Main.Strategy.Problema;

import Main.Strategy.Funcionario;
import Main.Strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalario {
    public void calculaReajusteAnual(Funcionario funcionario) {
        if(TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.multiply(new BigDecimal("0.10")));
        } else if(TipoContratacaoEnum.PJ.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.multiply(new BigDecimal("0.05")));
        }else if(TipoContratacaoEnum.ESTAGIO.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.multiply(new BigDecimal("0.02")));
        }
        }
}

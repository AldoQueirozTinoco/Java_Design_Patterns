package Main.Strategy.Solucao.Calculadoras;

import Main.Strategy.Funcionario;

import java.math.BigDecimal;

public class CalculadorReajusteAnualSalarioPJ implements CalculadorReajusteAnualSalario {

    @Override
    public void calcularReajusteAnualSalario(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal("0.05"))));
    }
}

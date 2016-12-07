package br.edu.ifpi.capar.cdi.livro.negocio;

import br.edu.ifpi.capar.cdi.livro.modelo.Escolaridade;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import java.util.Calendar;
import javax.annotation.PostConstruct;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraDeSalarios {

    public CalculadoraDeSalarios() {
        System.out.println("--- Iniciando calculadora de salários ...");
    }

    @PostConstruct
    public void init() {
        System.out.println("--- Calculadora de salários pronta ...");
    }

    public double calculaSalario(Funcionario funcionario) {
        double salario = funcionario.getCargo().getSalarioBase();
        Escolaridade escolaridadeFuncionario = funcionario.getEscolaridade();
        Escolaridade escolaridadeCargo = funcionario.getCargo().getEscolaridadeDesejada();

        //se o funcioanrio tem escolaridade inferior a esperada para o cargo
        if (escolaridadeFuncionario.compareTo(escolaridadeCargo) < 0) {
            salario = salario * 0.8;
        } //se o funcionario tem escolaridade superior a esperada para o cargo
        else if (escolaridadeFuncionario.compareTo(escolaridadeCargo) > 0) {
            salario = salario * 1.2;
        }

        int anoAtual = getAnoAtual();
        int anoAdmissao = funcionario.getAnoAdmissao();

        //da 1% de aumento para cada ano trabalhado na empresa
        double anosTrabalhados = anoAtual - anoAdmissao;
        double aumentoAntiguidade = anosTrabalhados / 100;
        salario = salario * (1 + aumentoAntiguidade);

        //se tem mais de 5 anos na empresa tem aumento de 10%
        if (anosTrabalhados > 5) {
            salario = salario * 1.1;
        }
        return salario;
    }

    private int getAnoAtual() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}

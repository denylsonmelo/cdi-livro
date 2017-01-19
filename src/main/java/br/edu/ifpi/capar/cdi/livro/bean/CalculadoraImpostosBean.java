package br.edu.ifpi.capar.cdi.livro.bean;

import br.edu.ifpi.capar.cdi.livro.builder.FuncionarioBuilder;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeImpostos;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Denylson Melo
 */
@Named @RequestScoped
public class CalculadoraImpostosBean {

    @Inject
    private CalculadoraDeImpostos calculadoraDeImpostos;
    private double salarioBase;
    private double imposto;

    public CalculadoraImpostosBean() {
        System.out.println("--- Instanciando a CalculadoraImpostosBean ...");
    }

    @PostConstruct
    public void ok() {
        System.out.println("--- CalculadoraImpostosBean pronta ...");
    }

    public void calculaImposto() {
        Funcionario funcionario = new FuncionarioBuilder().comSalarioBaseDe(salarioBase).build();

        System.out.println("--- Efetuando o cálculo ...");

        //a calculadora de IR usa outra classe para calcular o salário
        imposto = calculadoraDeImpostos.calculaImpostoDeRenda(funcionario);

        System.out.println("--- Fim ...");
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}

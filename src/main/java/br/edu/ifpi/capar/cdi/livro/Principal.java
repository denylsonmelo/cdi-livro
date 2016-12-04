package br.edu.ifpi.capar.cdi.livro;

import br.edu.ifpi.capar.cdi.livro.negocio.factory.CalculadoraDeSalariosFactory;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeSalarios;

/**
 *
 * @author Denylson Melo
 */
public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = buscaAlgumFuncionarioDeAlgumLugar();
        CalculadoraDeSalariosFactory factory = new CalculadoraDeSalariosFactory();
        CalculadoraDeSalarios calculadora = factory.criaCalculadora();
        double salario = calculadora.calculaSalario(funcionario);
        System.out.println("--- Salário: R$" + salario);
    }

    private static Funcionario buscaAlgumFuncionarioDeAlgumLugar() {
        System.out.println("--- Buscando algum funcionario de algum lugar");
        return new Funcionario();
    }
}

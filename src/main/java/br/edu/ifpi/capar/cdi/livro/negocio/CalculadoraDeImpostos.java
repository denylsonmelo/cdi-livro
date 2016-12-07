package br.edu.ifpi.capar.cdi.livro.negocio;

import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraDeImpostos {

    private final CalculadoraDeSalarios calculadoraDeSalarios;

    @Inject
    public CalculadoraDeImpostos(CalculadoraDeSalarios calculadora) {
        System.out.println("--- Iniciando calculadora de impostos ...");
        this.calculadoraDeSalarios = calculadora;
    }

    @PostConstruct
    public void init(){
        System.out.println("--- Calculadora de impostos pronta ...");
    }
    
    public double calculaImpostoDeRenda(Funcionario funcionario) {
        double salario = calculadoraDeSalarios.calculaSalario(funcionario);

        //tabela de IR de 2013
        double aliquota = 0.0;
        double parcelaDeduzir = 0.0;

        //ifs estao de forma mais didatica, na pratica poderiam ser reduzidos
        if (salario <= 1710.78) {
            aliquota = 0.0;
            parcelaDeduzir = 0.0;
        } else if (salario > 1710.78 && salario <= 2563.91) {
            aliquota = 7.5 / 100;
            parcelaDeduzir = 128.31;
        } else if (salario > 2563.91 && salario <= 3418.59) {
            aliquota = 15.0 / 100;
            parcelaDeduzir = 320.60;
        } else if (salario > 3418.59 && salario <= 4271.59) {
            aliquota = 22.5 / 100;
            parcelaDeduzir = 577.00;
        }else if (salario > 4271.59) {
            aliquota = 27.5 / 100;
            parcelaDeduzir = 790.58;
        }

        double impostoSemDesconto = salario * aliquota;
        return impostoSemDesconto - parcelaDeduzir;
    }
}

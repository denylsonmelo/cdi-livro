package br.edu.ifpi.capar.cdi.livro.negocio.impl;

import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeSalarios;
import br.edu.ifpi.capar.cdi.livro.negocio.TabelaDeReferenciaSalarial;

public class CalculadoraDeSalarioPadrao implements CalculadoraDeSalarios {

    @Override
    public double calculaSalario(Funcionario funcionario) {
        return 2000.0;
    }

    @Override
    public void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela) {
        System.out.println("--- Setando tabela de referencia salarial Padrão");
    }

}

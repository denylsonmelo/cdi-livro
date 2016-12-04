package br.edu.ifpi.capar.cdi.livro.negocio.impl;

import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import br.edu.ifpi.capar.cdi.livro.modelo.Escolaridade;
import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeSalarios;
import br.edu.ifpi.capar.cdi.livro.negocio.TabelaDeReferenciaSalarial;

public class CalculadoraDeSalariosPlano2002 implements CalculadoraDeSalarios {

    @Override
    public double calculaSalario(Funcionario funcionario) {
        if (funcionario.getEscolaridade() == Escolaridade.SUPERIOR) {
            return 3000.0;
        } else {
            return 2000.0;
        }
    }

    @Override
    public void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela) {
        System.out.println("--- Setando tabela de referencia salarial do Plano de 2002");
    }

}

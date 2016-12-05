package br.edu.ifpi.capar.cdi.livro.negocio.impl;

import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import br.edu.ifpi.capar.cdi.livro.modelo.Escolaridade;
import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeSalarios;
import br.edu.ifpi.capar.cdi.livro.negocio.TabelaDeReferenciaSalarial;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.In;

@AutoCreate
@Name("calculadoraDeSalarios")
public class CalculadoraDeSalariosPlano2002 implements CalculadoraDeSalarios {

    @Override
    public double calculaSalario(Funcionario funcionario) {
        if (funcionario.getEscolaridade() == Escolaridade.SUPERIOR) {
            return 3000.0;
        } else {
            return 2000.0;
        }
    }

    @In
    @Override
    public void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela) {
        System.out.println("--- Setando tabela de referencia salarial do Plano de 2002");
    }

}

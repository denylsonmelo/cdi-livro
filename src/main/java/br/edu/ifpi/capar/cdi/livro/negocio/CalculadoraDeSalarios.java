package br.edu.ifpi.capar.cdi.livro.negocio;

import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;

/**
 *
 * @author Denylson Melo
 */
public interface CalculadoraDeSalarios {

    double calculaSalario(Funcionario funcionario);
    void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela);
}

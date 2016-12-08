package br.edu.ifpi.capar.cdi.livro.negocio;

import br.edu.ifpi.capar.cdi.livro.modelo.Folha;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraFolhaPagamentoReal implements CalculadoraFolhaPagamento {

    @Override
    public Folha calculaFolha(List<Funcionario> funcionarios) {
        System.out.println("--- Efetua o cálculo real da folha de pagamentos ...");
        return null;
    }

}

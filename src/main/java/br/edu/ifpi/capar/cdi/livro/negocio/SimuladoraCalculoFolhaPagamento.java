package br.edu.ifpi.capar.cdi.livro.negocio;

import br.edu.ifpi.capar.cdi.livro.modelo.Folha;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import br.edu.ifpi.capar.cdi.livro.qualifier.Simulador;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
@Simulador
public class SimuladoraCalculoFolhaPagamento implements CalculadoraFolhaPagamento {

    @Override
    public Folha calculaFolha(List<Funcionario> funcionarios) {
        System.out.println("--- Efetua a simulação da folha de pagamentos ...");
        return null;
    }

}

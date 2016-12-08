package br.edu.ifpi.capar.cdi.livro.negocio;

import br.edu.ifpi.capar.cdi.livro.modelo.Folha;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import static br.edu.ifpi.capar.cdi.livro.modelo.PlanoDeCargos.VERSAO_2013;
import br.edu.ifpi.capar.cdi.livro.qualifier.Simulador;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
@Simulador(planoDeCargos = VERSAO_2013)
public class SimuladoraCalculoFolhaPagamentoPlano2013 implements CalculadoraFolhaPagamento {

    @Override
    public Folha calculaFolha(List<Funcionario> funcionarios) {
        System.out.println("--- Efetua a simulação da folha de pagamentos com plano de 2013 ...");
        return null;
    }

}

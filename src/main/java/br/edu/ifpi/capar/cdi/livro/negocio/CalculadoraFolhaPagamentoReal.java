package br.edu.ifpi.capar.cdi.livro.negocio;

import br.edu.ifpi.capar.cdi.livro.modelo.Folha;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraFolhaPagamentoReal implements CalculadoraFolhaPagamento, Serializable {

    @Inject
    private CalculadoraDeSalarios calculadoraDeSalarios;
    
    @Override
    public Folha calculaFolha(List<Funcionario> funcionarios) {
        double valor = 0.0;
        for (Funcionario funcionario : funcionarios) {
            valor += calculadoraDeSalarios.calculaSalario(funcionario);
        }
        return new Folha(new Date(), valor, funcionarios);
    }

}

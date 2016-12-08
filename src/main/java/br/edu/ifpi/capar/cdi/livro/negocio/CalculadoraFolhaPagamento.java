package br.edu.ifpi.capar.cdi.livro.negocio;

import br.edu.ifpi.capar.cdi.livro.modelo.Folha;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public interface CalculadoraFolhaPagamento {
    Folha calculaFolha(List<Funcionario> funcionarios);
}

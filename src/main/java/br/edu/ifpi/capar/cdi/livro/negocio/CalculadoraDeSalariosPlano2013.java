package br.edu.ifpi.capar.cdi.livro.negocio;

import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.interceptor.Interceptor;

/**
 *
 * @author Denylson Melo
 */
@Alternative @Priority(Interceptor.Priority.APPLICATION)
public class CalculadoraDeSalariosPlano2013 implements CalculadoraDeSalarios {

    //o novo código, que nesse exemplo não influencia no entendimento
    @Override
    public double calculaSalario(Funcionario funcionario) {
        return 0.0;
    }
}

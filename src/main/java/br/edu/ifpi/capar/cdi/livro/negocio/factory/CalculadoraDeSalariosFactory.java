package br.edu.ifpi.capar.cdi.livro.negocio.factory;

import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeSalarios;
import org.jboss.seam.Component;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraDeSalariosFactory {

    public CalculadoraDeSalarios criaCalculadora() {
        // não configurado para capturar o context do seam no metodo main da Classe Principal
        CalculadoraDeSalarios calculadora = (CalculadoraDeSalarios) Component.getInstance("calculadoraDeSalarios");
        return calculadora;
    }
}

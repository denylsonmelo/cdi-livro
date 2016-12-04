package br.edu.ifpi.capar.cdi.livro.negocio.factory;

import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeSalarios;
import br.edu.ifpi.capar.cdi.livro.negocio.impl.CalculadoraDeSalariosPlano2002;
import br.edu.ifpi.capar.cdi.livro.negocio.TabelaDeReferenciaSalarial;
import br.edu.ifpi.capar.cdi.livro.negocio.impl.TabelaDeReferenciaSalarialPadrao;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraDeSalariosFactory {
    
    public CalculadoraDeSalarios criaCalculadora(){
        TabelaDeReferenciaSalarial pisosSalariais = new TabelaDeReferenciaSalarialPadrao();
        CalculadoraDeSalarios calculadora = new CalculadoraDeSalariosPlano2002();
        calculadora.setTabelaDeReferenciaSalarial(pisosSalariais);
        return calculadora;
    }
}

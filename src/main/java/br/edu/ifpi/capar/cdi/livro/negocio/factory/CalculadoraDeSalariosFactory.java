package br.edu.ifpi.capar.cdi.livro.negocio.factory;

import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeSalarios;
import br.edu.ifpi.capar.cdi.livro.negocio.TabelaDeReferenciaSalarial;
import java.util.ResourceBundle;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraDeSalariosFactory {

    private final ResourceBundle bundle = ResourceBundle.getBundle("dependencias");

    public CalculadoraDeSalarios criaCalculadora() {
        TabelaDeReferenciaSalarial pisosSalariais = criaInstancia(TabelaDeReferenciaSalarial.class);
        CalculadoraDeSalarios calculadora = criaInstancia(CalculadoraDeSalarios.class);
        calculadora.setTabelaDeReferenciaSalarial(pisosSalariais);
        return calculadora;
    }

    private <T> T criaInstancia(Class<T> classe) {
        String nomeDaClasse = bundle.getString(classe.getSimpleName());
        try {
            Class<?> clazz = Class.forName(nomeDaClasse);
            return clazz.asSubclass(classe).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            return null;
        }
    }
}

package br.edu.ifpi.capar.cdi.livro.negocio.factory;

import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeSalarios;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Denylson Melo
 */
public class CalculadoraDeSalariosFactory {

    private final ApplicationContext context = new ClassPathXmlApplicationContext("dependencias.xml");

    public CalculadoraDeSalarios criaCalculadora() {
        CalculadoraDeSalarios calculadora = (CalculadoraDeSalarios) context.getBean("calculadora");
        return calculadora;
    }
}

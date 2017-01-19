package br.edu.ifpi.capar.cdi.livro.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Denylson Melo
 */
public class Folha {

    private final Date date;
    private final double valor;
    private final List<Funcionario> funcionarios;

    public Folha(Date date, double valor, List<Funcionario> funcionarios) {
        this.date = date;
        this.valor = valor;
        this.funcionarios = funcionarios;
    }

    public double getValor() {
        return valor;
    }
}

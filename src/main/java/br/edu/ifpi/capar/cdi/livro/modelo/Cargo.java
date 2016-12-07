package br.edu.ifpi.capar.cdi.livro.modelo;

/**
 *
 * @author Denylson Melo
 */
public class Cargo {

    private double salarioBase;
    private Escolaridade escolaridade;
    
    public Cargo(double salarioBase, Escolaridade escolaridadeCargo) {
        this.salarioBase = salarioBase;
        this.escolaridade = escolaridadeCargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Escolaridade getEscolaridadeDesejada() {
        return escolaridade;
    }
    
}

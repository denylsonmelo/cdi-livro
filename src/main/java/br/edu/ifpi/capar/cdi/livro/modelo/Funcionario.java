package br.edu.ifpi.capar.cdi.livro.modelo;

/**
 *
 * @author Denylson Melo
 */
public class Funcionario {

    private Cargo cargo;
    private Escolaridade escolaridade;
    private int anoAdmissao;
    
    public Funcionario(Cargo cargo, Escolaridade escolaridadeFuncionario, int anoAdmissao) {
        this.cargo = cargo;
        this.escolaridade = escolaridadeFuncionario;
        this.anoAdmissao = anoAdmissao;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public int getAnoAdmissao() {
        return anoAdmissao;
    }
}

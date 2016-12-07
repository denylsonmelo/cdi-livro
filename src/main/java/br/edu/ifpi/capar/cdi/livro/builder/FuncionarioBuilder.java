package br.edu.ifpi.capar.cdi.livro.builder;

import br.edu.ifpi.capar.cdi.livro.modelo.Cargo;
import br.edu.ifpi.capar.cdi.livro.modelo.Escolaridade;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import java.util.Calendar;

/**
 *
 * @author Denylson Melo
 */
public class FuncionarioBuilder {

    private final int anoAdmissao;
    private final Escolaridade escolaridadeFuncionario;
    private final Escolaridade escolaridadeCargo;
    private double salarioBase;

    public FuncionarioBuilder() {
        escolaridadeCargo = Escolaridade.SUPERIOR;
        escolaridadeFuncionario = Escolaridade.SUPERIOR;
        anoAdmissao = Calendar.getInstance().get(Calendar.YEAR);
    }

    public FuncionarioBuilder comSalarioBaseDe(double salarioBase) {
        this.salarioBase = salarioBase;
        return this;
    }

    public Funcionario build() {
        Cargo cargo = new Cargo(salarioBase, escolaridadeCargo);
        return new Funcionario(cargo, escolaridadeFuncionario, anoAdmissao);
    }
}

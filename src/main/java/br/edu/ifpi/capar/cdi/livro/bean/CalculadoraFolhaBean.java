package br.edu.ifpi.capar.cdi.livro.bean;

import br.edu.ifpi.capar.cdi.livro.builder.FuncionarioBuilder;
import br.edu.ifpi.capar.cdi.livro.modelo.Folha;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraFolhaPagamento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Denylson Melo
 */
@ConversationScoped @Named
public class CalculadoraFolhaBean implements Serializable{
    
    @Inject
    private Conversation conversation;
    @Inject
    private CalculadoraFolhaPagamento calculadoraFolha;
    private FuncionarioBuilder builder;
    private Folha folha;
    private List<Funcionario> funcionarios;
    private double salarioFuncionario;
    
    public void calcularFolha(){
        folha = calculadoraFolha.calculaFolha(getFuncionarios());
    }
    
    public void adicionaFuncionario(){
        Funcionario funcionario =  builder.comSalarioBaseDe(salarioFuncionario).build();
        getFuncionarios().add(funcionario);
    }
    
    @PostConstruct
    public void init(){
        builder = new FuncionarioBuilder();
        funcionarios = new ArrayList<>();
    }
    
    public void iniciaConversacao(){
        if(conversation.isTransient()){
            conversation.begin();
        }
    }
    
    public void terminaConversacao(){
        if(!conversation.isTransient()){
            conversation.end();
        }
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public Folha getFolha() {
        return folha;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}

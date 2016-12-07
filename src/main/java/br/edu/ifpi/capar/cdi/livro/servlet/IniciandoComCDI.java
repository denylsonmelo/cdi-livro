package br.edu.ifpi.capar.cdi.livro.servlet;

import br.edu.ifpi.capar.cdi.livro.builder.FuncionarioBuilder;
import br.edu.ifpi.capar.cdi.livro.modelo.Funcionario;
import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeImpostos;
import java.io.IOException;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Denylson Melo
 */
@WebServlet("/hello-cdi")
public class IniciandoComCDI extends HttpServlet {

    @Inject
    private CalculadoraDeImpostos calculadoraDeImpostos;

    public IniciandoComCDI() {
        System.out.println("--- Instanciando a Servlet ...");
    }

    @PostConstruct
    public void ok() {
        System.out.println("--- Servlet pronta ...");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double salarioBase = Double.parseDouble(req.getParameter("salario"));
        Funcionario funcionario = new FuncionarioBuilder().comSalarioBaseDe(salarioBase).build();

        System.out.println("--- Efetuando o cálculo ...");

        //a calculadora de IR usa outra classe para calcular o salário
        double imposto = calculadoraDeImpostos.calculaImpostoDeRenda(funcionario);

        resp.getOutputStream().print(String.format("Salário base: R$ %.2f\n"
                + "Imposto devido: R$ %.2f", salarioBase, imposto));
        System.out.println("--- Fim ...");
    }
}

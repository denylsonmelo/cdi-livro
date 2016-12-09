package br.edu.ifpi.capar.cdi.livro.servlet;

import br.edu.ifpi.capar.cdi.livro.negocio.CalculadoraDeSalarios;
import java.io.IOException;
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
@WebServlet("/calcular-salario")
public class CalculadoraSalario extends HttpServlet {

    @Inject
    private CalculadoraDeSalarios calculadoraDeSalarios;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().print("Calculadora: " + calculadoraDeSalarios.getClass());
    }

}

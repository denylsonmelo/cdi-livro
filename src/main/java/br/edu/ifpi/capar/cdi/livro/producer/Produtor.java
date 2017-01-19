package br.edu.ifpi.capar.cdi.livro.producer;

import br.edu.ifpi.capar.cdi.livro.modelo.UsuarioLogado;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Denylson Melo
 */
public class Produtor {

    private final Logger logger = LoggerFactory.getLogger(Produtor.class);

    @Produces
    public Logger criaLogger(InjectionPoint ip, UsuarioLogado usuario) {
        Class classe = ip.getMember().getDeclaringClass();
        logger.info("Criando log para a classe " + classe + " e para o usuário " + usuario);
        return LoggerFactory.getLogger(classe.getName());
    }
}

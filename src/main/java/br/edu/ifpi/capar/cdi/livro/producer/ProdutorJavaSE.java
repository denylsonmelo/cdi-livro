package br.edu.ifpi.capar.cdi.livro.producer;

import br.edu.ifpi.capar.cdi.livro.qualifier.OrganizacionalDatabase;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Denylson Melo
 */
public class ProdutorJavaSE {

    @Produces
    @OrganizacionalDatabase
    public EntityManager criaEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("organizacionalDatabase");
        return emf.createEntityManager();
    }
}

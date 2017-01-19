package br.edu.ifpi.capar.cdi.livro.producer;

import br.edu.ifpi.capar.cdi.livro.qualifier.OrganizacionalDatabase;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Denylson Melo
 */
public class ProdutorJavaEE {

    @PersistenceContext(unitName = "organizacionalDatabase")
    @Produces @OrganizacionalDatabase
    EntityManager organizacionalEM;
}

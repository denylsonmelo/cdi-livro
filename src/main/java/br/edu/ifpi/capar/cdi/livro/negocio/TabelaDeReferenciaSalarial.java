package br.edu.ifpi.capar.cdi.livro.negocio;

import br.edu.ifpi.capar.cdi.livro.modelo.Cargo;

/**
 *
 * @author Denylson Melo
 */
public interface TabelaDeReferenciaSalarial {
    double buscaPisoSalarial(Cargo cargo);
}

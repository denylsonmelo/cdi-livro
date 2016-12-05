package br.edu.ifpi.capar.cdi.livro.negocio.impl;

import br.edu.ifpi.capar.cdi.livro.modelo.Cargo;
import br.edu.ifpi.capar.cdi.livro.negocio.TabelaDeReferenciaSalarial;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.AutoCreate;

@AutoCreate
@Name("tabelaDeReferenciaSalarial")
public class TabelaDeReferenciaSalarialPadrao implements TabelaDeReferenciaSalarial {

    @Override
    public double buscaPisoSalarial(Cargo cargo) {
        System.out.println("--- Buscando Piso salarial padrao");
        return 0;
    }

}

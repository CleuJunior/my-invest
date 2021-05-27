package br.com.cleonildojunior.myinvest.repository;

import br.com.cleonildojunior.myinvest.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}

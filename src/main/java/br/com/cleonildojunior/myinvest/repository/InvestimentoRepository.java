package br.com.cleonildojunior.myinvest.repository;

import br.com.cleonildojunior.myinvest.domain.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}


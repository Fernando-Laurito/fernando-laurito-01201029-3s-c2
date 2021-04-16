package br.com.luta.api.repository;

import br.com.luta.api.domain.Lutadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface LutadoresRepository extends JpaRepository<Lutadores, Integer>{


}

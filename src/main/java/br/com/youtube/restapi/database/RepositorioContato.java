package br.com.youtube.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.youtube.restapi.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato, Long> {
    
}

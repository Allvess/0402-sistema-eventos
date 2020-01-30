package br.com.sistema_eventos.repository;

import br.com.sistema_eventos.model.eventosModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface eventosRepository extends CrudRepository<eventosModel, Integer> {
    Optional<eventosModel> findByNome(String nome);
}

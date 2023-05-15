package br.techback2.agendaonline.agenda.repositories;

import br.techback2.agendaonline.agenda.models.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}

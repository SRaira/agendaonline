package br.techback2.agendaonline.agenda.repositories;


import br.techback2.agendaonline.agenda.models.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}

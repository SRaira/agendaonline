package br.techback2.agendaonline.agenda.repositories;


import br.techback2.agendaonline.agenda.models.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
}

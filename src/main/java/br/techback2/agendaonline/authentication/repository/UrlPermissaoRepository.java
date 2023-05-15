package br.techback2.agendaonline.authentication.repository;

import br.techback2.agendaonline.authentication.model.UrlPermissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlPermissaoRepository extends JpaRepository<UrlPermissao, Long> {
}

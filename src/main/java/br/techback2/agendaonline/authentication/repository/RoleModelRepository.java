package br.techback2.agendaonline.authentication.repository;

import br.techback2.agendaonline.authentication.model.RoleModel;
import br.techback2.agendaonline.enuns.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoleModelRepository extends JpaRepository<RoleModel, Long>{
    public List<RoleModel> findByRoleNameIn(List<RoleName> roles);
}

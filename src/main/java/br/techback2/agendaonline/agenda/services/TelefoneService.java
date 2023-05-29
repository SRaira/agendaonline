package br.techback2.agendaonline.agenda.services;

import br.techback2.agendaonline.agenda.models.Telefone;
import br.techback2.agendaonline.agenda.repositories.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelefoneService {


    @Autowired
    private TelefoneRepository telefoneRepository;
    public Telefone salvar(Telefone telefone){
        return telefoneRepository.save(telefone);
    }

    public List<Telefone> listar(){return telefoneRepository.findAll();}

    public void excluir(Long id) {
        telefoneRepository.deleteById(id);
    }
}

package br.techback2.agendaonline.agenda.services;

import br.techback2.agendaonline.agenda.models.Contato;
import br.techback2.agendaonline.agenda.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public Contato salvar(Contato contato){
        return contatoRepository.save(contato);
    }

    public List<Contato> listar (){return contatoRepository.findAll();}

    public void excluir(Long id) { contatoRepository.deleteById(id);
    }


}

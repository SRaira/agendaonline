package br.techback2.agendaonline.services;

import br.techback2.agendaonline.models.Contato;
import br.techback2.agendaonline.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    ContatoRepository repository;

    public Contato create(Contato contato){
        return repository.save(contato);
    }

    public Contato update (Contato contato) {return repository.save(contato);}

    public List<Contato> findAll (){return repository.findAll();}

    public Optional<Contato> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}

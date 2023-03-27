package br.techback2.agendaonline.services;

import br.techback2.agendaonline.models.Telefone;
import br.techback2.agendaonline.repositories.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelefoneService {


    @Autowired
    TelefoneRepository repository;
    public Telefone create(Telefone telefone){
        return repository.save(telefone);
    }

    public Telefone update(Telefone telefone) {return repository.save(telefone);}

    public List<Telefone> findAll(){return repository.findAll();}

    public Optional<Telefone> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

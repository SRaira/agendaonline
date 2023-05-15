package br.techback2.agendaonline.agenda.services;

import br.techback2.agendaonline.agenda.models.Email;
import br.techback2.agendaonline.agenda.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailService {

    @Autowired
    EmailRepository repository;

    public Email create(Email email){
        return repository.save(email);
    }

    public Email update(Email email) {return repository.save(email);}

    public List<Email> findAll(){return repository.findAll();}

    public Optional<Email> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}

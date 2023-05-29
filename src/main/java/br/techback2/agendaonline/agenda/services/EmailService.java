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
    private EmailRepository emailRepository;

    public Email salvar(Email email){
        return emailRepository.save(email);
    }

    public List<Email> listar(){return emailRepository.findAll();}


    public void excluir(Long id) {
        emailRepository.deleteById(id);
    }


}

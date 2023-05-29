package br.techback2.agendaonline.agenda.controller;

import br.techback2.agendaonline.agenda.models.Email;
import br.techback2.agendaonline.agenda.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/email")
public class EmailControllers {


    @Autowired
    private EmailService emailService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Email> salvar(@RequestBody Email email) {
        Email emailSalvo = emailService.salvar(email);

        return ResponseEntity.status(201).body(emailSalvo);
    }

    @GetMapping("/listar-todos")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @ResponseStatus(HttpStatus.OK)
    public List<Email> listar() {return emailService.listar();
    }


    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        emailService.excluir(id);
    }


}

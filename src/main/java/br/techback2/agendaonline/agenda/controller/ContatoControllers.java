package br.techback2.agendaonline.agenda.controller;

import br.techback2.agendaonline.agenda.models.Contato;
import br.techback2.agendaonline.agenda.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contato")
public class ContatoControllers {

    @Autowired
    private ContatoService contatoService;


    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Contato> salvar(@RequestBody Contato contato) {
        Contato contatoSalvo = contatoService.salvar(contato);

        return ResponseEntity.status(201).body(contatoSalvo);
    }


    @GetMapping("/listar-todos")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @ResponseStatus(HttpStatus.OK)
    public List<Contato> listar() {return contatoService.listar();}


    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { contatoService.excluir(id);}

}


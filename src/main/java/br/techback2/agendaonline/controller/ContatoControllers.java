package br.techback2.agendaonline.controller;

import br.techback2.agendaonline.models.Contato;
import br.techback2.agendaonline.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contato")
public class ContatoControllers {

    @Autowired
    ContatoService service;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Contato> create(@RequestBody Contato contato) {
        Contato contatoCreated = service.create(contato);

        return ResponseEntity.status(201).body(contatoCreated);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Contato> update(@RequestBody Contato contato) {
        Contato contatoCreated = service.create(contato);

        return ResponseEntity.status(201).body(contatoCreated);
    }

    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Contato> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Contato> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}


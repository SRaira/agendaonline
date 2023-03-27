package br.techback2.agendaonline.controller;

import br.techback2.agendaonline.models.Telefone;
import br.techback2.agendaonline.services.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class TelefoneControllers {


    @Autowired
    TelefoneService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Telefone> create(@RequestBody Telefone telefone) {
        Telefone telefoneCreated = service.create(telefone);

        return ResponseEntity.status(201).body(telefoneCreated);
    }
}

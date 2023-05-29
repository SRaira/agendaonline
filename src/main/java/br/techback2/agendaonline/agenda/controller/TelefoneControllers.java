package br.techback2.agendaonline.agenda.controller;

import br.techback2.agendaonline.agenda.models.Email;
import br.techback2.agendaonline.agenda.models.Telefone;
import br.techback2.agendaonline.agenda.services.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TelefoneControllers {


    @Autowired
    private TelefoneService telefoneService;

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Telefone> create(@RequestBody Telefone telefone) {
        Telefone telefoneSalvo = telefoneService.salvar(telefone);

        return ResponseEntity.status(201).body(telefoneSalvo);
    }

    @GetMapping("/listar-todos")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @ResponseStatus(HttpStatus.OK)
    public List<Telefone> listar() {
        return telefoneService.listar();
    }


    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        telefoneService.excluir(id);

    }
}

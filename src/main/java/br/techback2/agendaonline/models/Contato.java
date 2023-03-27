package br.techback2.agendaonline.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contato implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;

    @OneToMany
    @JoinColumn(name="email_id")
    private Set<Email> listemails;

    @OneToMany
    @JoinColumn(name="telefone_id")
    private Set<Telefone> listtelefones;

    public Contato(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
}

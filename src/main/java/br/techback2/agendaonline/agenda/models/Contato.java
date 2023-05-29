package br.techback2.agendaonline.agenda.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contato implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne(optional = true)
    @JoinColumn(name="email_id")
    private Set<Email> listemails;

    @ManyToOne(optional = true)
    @JoinColumn(name="telefone_id")
    private Set<Telefone> listtelefones;

    public Contato(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
}

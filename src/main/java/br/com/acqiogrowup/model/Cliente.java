package br.com.acqiogrowup.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter @Setter
//@Table(name="nome-tabela")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(name="descricaocargo")
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;
    private String email;
    private Endereco endereco;
    private Cartao cartao;



}

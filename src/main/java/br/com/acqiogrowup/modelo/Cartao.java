package br.com.acqiogrowup.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter @Setter
public class Cartao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartaoId;
    private String nomeTitular;
    private String numeroCartao;
    private Integer mesValidade;
    private Integer anoValidade;
    private Integer cvv;

}

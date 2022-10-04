package br.com.acqiogrowup.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter
//@Table(name="nome-tabela")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    //@Column(name="descricaocargo")
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;
    private String email;

    @OneToOne
    @JoinColumn (name="idCarrinho")
    private Carrinho carrinho;

    @ManyToOne
    @JoinColumn (name="idEndereco")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn (name="idCartao")
    private Cartao cartao;

}

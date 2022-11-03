package br.com.acqiogrowup.modelo;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;
    private String email;

    /*
    @OneToOne
    @JoinColumn (name="idCarrinho")
    private Carrinho carrinho;
    */

    @OneToOne
    @JoinColumn (name="idEndereco")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn (name="idCartao")
    private Cartao cartao;

}
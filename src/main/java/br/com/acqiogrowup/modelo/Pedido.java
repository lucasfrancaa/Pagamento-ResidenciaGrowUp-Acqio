package br.com.acqiogrowup.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedidoId;


    @OneToMany
    @JoinColumn (name="idProduto")
    private List<Produto> listaProdutos;

    @ManyToOne
    @JoinColumn (name="idCliente")
    private Cliente cliente;


    /* OBSERVAÇÃO

    NESSES DOIS ATRIBUTOS ABAIXO O @ONETOONE NÃO IMPEDE O PROJETO DE FUNCIONAR,
    JÁ COM O @ONETOMANY OS TIPOS DÃO ERRO.

    */

    @ManyToOne
    @JoinColumn (name="idPagamento")
    private Pagamento pagamento;

    @OneToOne
    @JoinColumn (name="idEndereco")
    private Endereco endereco;
}
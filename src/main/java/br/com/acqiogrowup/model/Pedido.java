package br.com.acqiogrowup.model;

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

    @ManyToOne
    @JoinColumn (name="idProduto")
    private List<Produto> listaProdutos;

    @OneToOne
    @JoinColumn (name="idCliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn (name="idPagamento")
    private Pagamento pagamento;

    @OneToOne
    @JoinColumn (name="idEndereco")
    private Endereco endereco;
}

package br.com.acqiogrowup.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pagamentoId;
    private Double valor;
    private Integer parcelas;


    /* OBSERVAÇÃO

    ANTES ESTAVA COM @ONETOMANY E AGORA MUDAMOS PRA @MANYTOONE

    QUAL O CORRETO?

    */

    @ManyToOne
    @JoinColumn (name="idCartao")
    private Cartao cartao;

}

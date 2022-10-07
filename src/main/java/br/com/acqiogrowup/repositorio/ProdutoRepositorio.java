package br.com.acqiogrowup.repositorio;


import br.com.acqiogrowup.modelo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepositorio extends JpaRepository <Produto, Long> {
}

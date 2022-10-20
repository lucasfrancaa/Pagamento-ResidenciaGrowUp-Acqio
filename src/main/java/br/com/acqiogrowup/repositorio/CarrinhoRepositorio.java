package br.com.acqiogrowup.repositorio;

import br.com.acqiogrowup.modelo.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepositorio extends JpaRepository<Carrinho, Long> {
}

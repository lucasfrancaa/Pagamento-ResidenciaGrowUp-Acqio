package br.com.acqiogrowup.repositorio;

import br.com.acqiogrowup.modelo.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepositorio extends JpaRepository<Endereco, Long> {
}

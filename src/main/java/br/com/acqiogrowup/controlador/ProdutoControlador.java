package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.Produto;
import br.com.acqiogrowup.repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoControlador {

    @Autowired
    ProdutoRepositorio produtoRepositorio;

    @GetMapping
    public List<Produto> listar(){
        return produtoRepositorio.findAll();
    }

    /* OBS

    PRECISAMOS INSERIR O PRODUTO NO CARRINHO

     */
}

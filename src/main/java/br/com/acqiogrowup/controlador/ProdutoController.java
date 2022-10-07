package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.Produto;
import br.com.acqiogrowup.repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoRepositorio produtoRepositorio;

    @PostMapping
    public Produto create (@RequestBody Produto produto){
        return produtoRepositorio.save(produto);
    }

    @GetMapping
    public List<Produto> list(){
        return produtoRepositorio.findAll();
    }
}

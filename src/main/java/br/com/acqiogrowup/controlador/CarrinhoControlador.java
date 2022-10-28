package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.Carrinho;
import br.com.acqiogrowup.modelo.Produto;
import br.com.acqiogrowup.repositorio.CarrinhoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrinho")

public class CarrinhoControlador {

    @Autowired
    CarrinhoRepositorio carrinhoRepositorio;

    @GetMapping
    public List<Carrinho> listar(){
        return carrinhoRepositorio.findAll();
    }

    /*
    @PostMapping
    public void inserir(Produto produto) {
        produtoRepositorio.save(produto);
    }

     */

}

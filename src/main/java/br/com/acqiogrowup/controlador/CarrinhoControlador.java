package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.Carrinho;
import br.com.acqiogrowup.repositorio.CarrinhoRepositorio;
import br.com.acqiogrowup.repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/carrinho")

public class CarrinhoControlador {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Autowired
    private CarrinhoRepositorio carrinhoRepositorio;

    @GetMapping
    public List<Carrinho> listar(){
        return carrinhoRepositorio.findAll();
    }

}

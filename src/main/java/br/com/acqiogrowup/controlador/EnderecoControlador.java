package br.com.acqiogrowup.controlador;


import br.com.acqiogrowup.modelo.Endereco;
import br.com.acqiogrowup.repositorio.EnderecoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoControlador {

    @Autowired
    private EnderecoRepositorio enderecoRepositorio;


    @PostMapping
    public Endereco cadastrar (@RequestBody Endereco endereco){
        return enderecoRepositorio.save(endereco);
    }

    @GetMapping
    public List<Endereco> listar(){
        return enderecoRepositorio.findAll();
    }

    @PutMapping
    public void atualizar (@RequestBody Endereco endereco){
        enderecoRepositorio.save(endereco);
    }

    @DeleteMapping("/{enderecoId}")
    public void apagar (@PathVariable Long enderecoId){
        enderecoRepositorio.deleteById(enderecoId);
    }
}

package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.Cliente;
import br.com.acqiogrowup.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")

public class ClienteControlador {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @PostMapping
    public void cadastrar(Cliente cliente) {
        clienteRepositorio.save(cliente);
    };

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepositorio.findAll();
    }
}
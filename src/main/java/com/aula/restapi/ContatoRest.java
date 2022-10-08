package com.aula.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.restapi.database.RepositorioContato;
import com.aula.restapi.entidade.Contato;

@RestController
@RequestMapping ("/contatos")
public class ContatoRest {
    
    @Autowired
    private RepositorioContato repositorio;

    @GetMapping
    public List<Contato> getContatos() {
        return repositorio.findAll();
    }
    @PostMapping
    public void salva ( @RequestBody Contato contato) {
        repositorio.save(contato);
    }

    @PutMapping
    public void altera ( @RequestBody Contato contato) {
        if(contato.getId() > 0) {
            repositorio.save(contato);
        }
    }
    @DeleteMapping
    public void remove ( @RequestBody Contato contato) {
        repositorio.delete(contato);
    }
}

package br.com.luta.api.controller;

import br.com.luta.api.domain.Lutadores;
import br.com.luta.api.repository.LutadoresRepository;
import jdk.jfr.internal.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lutadores")
public class LutaLivreController {

    @Autowired
    private LutadoresRepository lutadorRepository;

    @PostMapping()
    public ResponseEntity postLutador(@RequestBody Lutadores lutador){
        lutador.setVida(100.0);
        lutador.setConcentracoesRealizadas(0);
        lutador.setVivo(false);
        lutadorRepository.save(lutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping()
    public ResponseEntity getLutadores(){
        if(lutadorRepository.count() > 0){
            return ResponseEntity.ok(lutadorRepository.findAll());
        } else {
            return ResponseEntity.status(204).build();
        }
    }

    @GetMapping("/contagem-vivos")
    public ResponseEntity getLutadoresVivos(){
        List<Lutadores> lutadores = lutadorRepository.findAll();
        if(lutadores.isEmpty()){
            return ResponseEntity.status(204).build();
        } else{
            return ResponseEntity.status(200).body(lutadorRepository.co)
        }
    }

}

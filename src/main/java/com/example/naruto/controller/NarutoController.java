package com.example.naruto.controller;

import com.example.naruto.model.caracteristicas.Caracteristica;
import com.example.naruto.service.impl.NarutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class NarutoController {

    @Autowired
    private NarutoServiceImpl narutoService;

    @GetMapping(value = "naruto/futon")
    public ResponseEntity<Caracteristica> futon(){
        return new ResponseEntity<>(narutoService.futon(), HttpStatus.OK);
    }

    @GetMapping(value = "naruto/resengan/{opcao}")
    public ResponseEntity<Caracteristica> resengan(@PathVariable Integer opcao){
        return new ResponseEntity<>(narutoService.resengan(opcao), HttpStatus.OK);
    }

    @GetMapping(value = "naruto/modosabio")
    public ResponseEntity<Caracteristica> modoSabio(){
        return new ResponseEntity<>(narutoService.modoSabio(),HttpStatus.OK);
    }

    @GetMapping(value = "naruto/transformacao/{opcao}")
    public ResponseEntity<Caracteristica> transformacao(@PathVariable Integer opcao){
        return new ResponseEntity<>(narutoService.transformacao(opcao), HttpStatus.OK);
    }

    @GetMapping(value = "naruto/extrairbiju")
    public ResponseEntity<Caracteristica> extrairBiju(){
        return new ResponseEntity<>(narutoService.extrairBiju(),HttpStatus.OK);
    }
}

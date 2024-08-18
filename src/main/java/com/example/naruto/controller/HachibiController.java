package com.example.naruto.controller;

import com.example.naruto.model.caracteristicas.Caracteristica;
import com.example.naruto.service.impl.HachibiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HachibiController {

    @Autowired
    private HachibiServiceImpl hachibiService;


    @GetMapping(value = "hachibi/falar")
    public ResponseEntity<Caracteristica> falar(){
        return new ResponseEntity<>(hachibiService.falar(), HttpStatus.OK);

    }

    @GetMapping(value = "hachibi/falar/{opcao}")
    public ResponseEntity<Caracteristica> falar(@PathVariable Integer opcao){
        return new ResponseEntity<>(hachibiService.falar(opcao), HttpStatus.OK);

    }

    @GetMapping(value = "hachibi/extrairbiju")
    public ResponseEntity<Caracteristica> extrairBiju(){
        return new ResponseEntity<>(hachibiService.extrairBiju(),HttpStatus.OK);
    }
}
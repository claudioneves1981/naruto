package com.example.naruto.controller;

import com.example.naruto.model.caracteristicas.Caracteristica;
import com.example.naruto.service.impl.KuramaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KuramaController {

    @Autowired
    private KuramaServiceImpl kuramaService;


    @GetMapping(value = "kurama/falar")
    public ResponseEntity<Caracteristica> falar(){
        return new ResponseEntity<>(kuramaService.falar(), HttpStatus.OK);

    }
}

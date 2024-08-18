package com.example.naruto.service.impl;

import com.example.naruto.model.caracteristicas.Caracteristica;
import com.example.naruto.model.biju.Kurama;
import com.example.naruto.service.BijuService;
import org.springframework.stereotype.Service;

@Service
public class KuramaServiceImpl implements BijuService {

    @Override
    public Caracteristica falar() {

        Caracteristica falar = new Kurama();
        falar.setCaracteristica("Irritação na fala");
        return falar;
    }
}

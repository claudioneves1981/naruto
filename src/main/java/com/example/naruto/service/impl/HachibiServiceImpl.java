package com.example.naruto.service.impl;

import com.example.naruto.model.caracteristicas.Caracteristica;
import com.example.naruto.model.biju.Hachibi;
import com.example.naruto.service.BijuService;
import com.example.naruto.service.ExtrairBijuService;
import org.springframework.stereotype.Service;

@Service
public class HachibiServiceImpl implements BijuService, ExtrairBijuService {

    @Override
    public Caracteristica falar() {

        Caracteristica falar = new Hachibi();
        falar.setCaracteristica("Fala Normal");
        return falar;
    }

    public Caracteristica falar(int opcao) {

        Caracteristica falar = new Hachibi();
        falar.setCaracteristica("Fala Como um Rapper");
        return falar;
    }


    @Override
    public Caracteristica extrairBiju() {
        Caracteristica hachibi  = new Hachibi();
        hachibi.setCaracteristica("Extração de Biju Hachibi");
        return hachibi;
    }
}

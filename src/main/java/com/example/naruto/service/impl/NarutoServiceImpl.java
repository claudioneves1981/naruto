package com.example.naruto.service.impl;

import com.example.naruto.model.biju.Kurama;
import com.example.naruto.model.caracteristicas.*;
import com.example.naruto.service.ExtrairBijuService;
import com.example.naruto.service.NarutoService;
import org.springframework.stereotype.Service;

@Service
public class NarutoServiceImpl implements NarutoService, ExtrairBijuService {

    @Override
    public Caracteristica futon() {

        Caracteristica futon = new Futon();
        futon.setCaracteristica("Chakra da Natureza");
        return futon;
    }

    @Override
    public Caracteristica resengan(Integer opcao) {

        Caracteristica rasengan = new Rasengan();
        if(opcao == 1){
            rasengan.setCaracteristica("Rasengan");
        }else if(opcao == 2){
            rasengan.setCaracteristica("Oodama Rasengan");
        }else{
            rasengan.setCaracteristica("Rasen Shuriken");
        }

        return rasengan;

    }

    @Override
    public Caracteristica modoSabio() {

        Caracteristica modoSabio = new ModoSabio();
        modoSabio.setCaracteristica("Modo Sábio");
        return modoSabio;

    }

    @Override
    public Caracteristica transformacao(Integer opcao) {

        Caracteristica transformacao = new Transformacao();
        if(opcao == 1){
            transformacao.setCaracteristica("Vira Raposa de 3 caldas");
        }else if(opcao == 2){
            transformacao.setCaracteristica("Vira Raposa de 5 caldas");
        }else if (opcao == 3){
            transformacao.setCaracteristica("Vira Raposa de 9 caldas");
        }else if (opcao == 4){
            transformacao.setCaracteristica("Modo Sábio dos 6 caminhos");
        }else{
            transformacao.setCaracteristica("Modo Biju");
        }

        return transformacao;

    }

    @Override
    public Caracteristica extrairBiju() {
        Caracteristica kurama  = new Kurama();
        kurama.setCaracteristica("Extração de Biju Kurama");
        return kurama;
    }


}

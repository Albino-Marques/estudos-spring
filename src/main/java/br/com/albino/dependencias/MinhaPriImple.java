package br.com.albino.dependencias;

import org.springframework.stereotype.Component;

@Component
public class MinhaPriImple implements MinhaInterface{

    @Override
    public void metodo() {
        System.out.println("*** Primeira Implementação!");
    }
}
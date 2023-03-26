package br.com.albino.restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TesteController {

    @GetMapping("/search")
    public String pesquisa(@RequestParam("idDoProduto") Integer id,
                           @RequestParam(value = "nomeDoProduto", required = false) String nome){
        // O @RequestParam torna paramêtros da URL obrigatórios!
        // A não ser que use os atributos citados no @Request do "nomeDoProduto".
        // Classe de banco de dados.
        System.out.println("********************** CHEGOU NA CONTROLLER TESTE - " + id + " "+ nome);




        return "teste";

    }
}


//https://www.google.com/search ? - O ponto de interrogação indica que a partir dali tudo são parametros.
// q=Java & - os parâmetros são chave e valor, sendo o "q" a chave e Java o valor.
// oq=Java&aqs=chrome..69i57j35i39j69i60l3j69i65l3
// .1367j0j7&sourceid=chrome&ie=UTF-8
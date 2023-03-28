package br.com.albino.restaurante.controller;

import br.com.albino.restaurante.model.ProdutoSimples;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Controller
public class HelloController_old {

    @GetMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("produtos", Arrays.asList(
                new ProdutoSimples(1, "Celular", BigDecimal.TEN, true, LocalDate.now()),
                new ProdutoSimples(2, "Notebook", new BigDecimal(20), false, LocalDate.of(2023,04,04)),
                new ProdutoSimples(3, "Video game", new BigDecimal(50), true, LocalDate.of(2010,10,10))));

        return "hello_old";
    }

//    @GetMapping("/um")
//    public ModelAndView modelAndView(){
//        ModelAndView modelAndView = new ModelAndView();
//
//        Produto produto = new Produto(1,"Peixe", "Peixe frito", Categoria.COMIDA, BigDecimal.TEN);
//
//        modelAndView.addObject("produto", produto);
//
//        return modelAndView;
//    }
}

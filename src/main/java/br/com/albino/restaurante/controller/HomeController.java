package br.com.albino.restaurante.controller;

import br.com.albino.restaurante.model.Categoria;
import br.com.albino.restaurante.model.Produto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Arrays;

@Controller
@RequestMapping("/home")
public class HomeController {

    //Exemplo de modelos -  Banco: ContaCorrente, Cliente, Agência, Banco, Funcionarios, ClienteDAO, ClienteRepository,
    // ClienteService

    @GetMapping
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("produto", new Produto(1, "Salada", "Salada de alface e tomate.", Categoria.COMIDA,
                new BigDecimal(35)));

        return modelAndView;
    }

    @GetMapping("/lista")
    public String lista(Model model) {

       Produto p1 = new Produto(1, "Salada", "Salada de alface e tomate.", Categoria.COMIDA,
                new BigDecimal(35));

        Produto p2 = new Produto(2, "Frango grelhado", "Frango grelhado com arroz.", Categoria.COMIDA,
                new BigDecimal(45));

        Produto p3 = new Produto(3, "Refrigerante", "Água Tônica sem açucar", Categoria.BEBIDA,BigDecimal.TEN);

        Produto p4 = new Produto(3, "Brigadeiro", "Brigadeiro de colher", Categoria.COMIDA,BigDecimal.TEN);

        model.addAttribute("produtos", Arrays.asList(p1, p2, p3,p4));

        System.out.println(Arrays.asList(p1, p2, p3));

        return "produtos";
    }

//    @PostMapping("/um")
//    public String cadastraProdutos(){
//        System.out.println("Página Home");
//        return "home";
//    }
//
//    @PostMapping("/dois") //Aqui só acessa com o POST
//    public String cadastraProdutor(){
//        System.out.println("Página home2");
//        return "home2";
//    }
}

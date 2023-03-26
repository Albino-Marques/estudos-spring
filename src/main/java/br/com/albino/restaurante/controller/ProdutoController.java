package br.com.albino.restaurante.controller;

import br.com.albino.restaurante.dao.ProdutoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoDao dao;

    @GetMapping("/lista")
    public String lista(Model model) {

        model.addAttribute("produtos", dao.lista());

        return "produtos";
    }

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @PostMapping("/cadastra")
    public void cadastra(){
        System.out.println("******** Método de cadastro *********");
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

// -> ServletDispatcher -> Controller
// Controller -> ServletDispatcher

// ViewResolver (JSP ou Thymeleaf): View Engine


    //Exemplo de modelos -  Banco: ContaCorrente, Cliente, Agência, Banco, Funcionarios, ClienteDAO, ClienteRepository,
    // ClienteService

//    @GetMapping
//    public ModelAndView home() {
//        ModelAndView modelAndView = new ModelAndView();
//
//        modelAndView.addObject("produto", new Produto(1, "Salada", "Salada de alface e tomate.", Categoria.COMIDA,
//                new BigDecimal(35)));
//
//        return modelAndView;
//    }
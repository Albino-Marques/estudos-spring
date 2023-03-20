package br.com.albino.dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    //Forma de fazer a injeção de dependência:
    //Field:  Através de propriedade com o @
    //Construtor: Fazer um construtor que irá receber a classe para instaciar
    //Setter: Através de setClasse()
    @Autowired
    private B b;

//    private MinhaPriImple priImple;
//    private MinhaInterface minhaInterface;

    public void metodoA() {
//        minhaInterface.metodo();
        b.metodoB();
    }

}

package br.com.albino.dependencias;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container =
                new AnnotationConfigApplicationContext(Main.class.getPackage().getName());

        A a = container.getBean(A.class);
        a.metodoA();
//        System.out.println(container);
    }
}

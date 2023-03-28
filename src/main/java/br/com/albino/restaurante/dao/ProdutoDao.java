package br.com.albino.restaurante.dao;

import br.com.albino.restaurante.model.Categoria;
import br.com.albino.restaurante.model.Produto;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoDao {
    private static List<Produto> produtos = new ArrayList<>();

    static {
        produtos.add(new Produto(1, "Salada", "Salada de alface e tomate.", Categoria.COMIDA,
                new BigDecimal(35)));
        produtos.add(new Produto(2, "Frango grelhado", "Frango grelhado com arroz.", Categoria.COMIDA,
                new BigDecimal(45)));
        produtos.add(new Produto(3, "Refrigerante", "Água Tônica sem açucar", Categoria.BEBIDA,BigDecimal.TEN));
        produtos.add(new Produto(4, "Brigadeiro", "Brigadeiro de colher", Categoria.COMIDA,BigDecimal.TEN));
    }

    public List<Produto> lista(){
        return produtos;
    }

    public void cadastra(Produto produto) {
        produtos.add(produto);
    }
}

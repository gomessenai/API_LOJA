package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    /*
    No construtor a lista de produtos sera preenchida
     */
    public TabelaProdutos() {
        Produto caneta = new Produto(1,"Caneta BIC","Caneta BIC na cor azul", 1.99);
        Produto borracha = new Produto(2,"Borracha branca", "Borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lapis Faber Caster", "Lapis Faber Castel comum", 2.99);
        Produto apontador = new Produto(4,"Apontador", "Apontador comum com reservatório", 7.99);
        Produto caderno = new Produto (5, "Caderno espiral", "Caderno espiral de 96 folhas", 15.99);
        Produto corretivo = new Produto (6, "Corretivo Branco", "Corretivo de boa qualidade", 4.99);
        Produto tesoura = new Produto (7, "Tesoura CASTELL", "Tesoura sem ponta", 9.99);
        Produto sulfite = new Produto (8, "Sulfite", "Pacote de 90 folhas", 19.99);
        Produto cola = new Produto (9, "Cola ", "Cola Branca", 2.99);
        Produto lapiseira = new Produto (5, "Lapiseira Castell", "Lapiseira da melhor qualidade", 4.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
        this.produtos.add(corretivo);
        this.produtos.add(tesoura);
        this.produtos.add(sulfite);
        this.produtos.add(cola);
        this.produtos.add(lapiseira);

    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    /**
     * Método que retorna todos os produtos da lista
     */
    public List<Produto> buscarTodosOsProdutos() {
        return this.getProdutos();
    }

    /**
     * Método que busca um produto pelo seu ID
     * Caso não encontre vai retornar nulo
     * @param produtoId
     * @return
     */
    public Produto buscarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p: this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
    return produtoProcurado;
}

public Produto cadastrarNovoProduto(Produto novoProduto) {
        int ultimoIndex = this.produtos.size() - 1;
        Produto ultimoProduto = this.produtos.get(ultimoIndex);
        int proximoId = ultimoProduto.getId() + 1;
        novoProduto.setId(proximoId);
        this.produtos.add(novoProduto);
        return novoProduto;

}

}
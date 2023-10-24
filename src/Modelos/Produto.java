package Modelos;

import utilidades.Utilidades;

public class Produto {         // Aqui declara um contador pra toda vez
    private static int count = 1;  // que a pessoa add um produto o Contador, Almenta 1.

    //Declarando os Atributos.
    private int id;   //Obs: Id recebe count
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.id = count;
        this.nome = nome;
        this.preco = preco;
        Produto.count += 1; //quando criado um Prod. È add 1
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;


    }

    @Override
    public String toString(){
        return "Id:" + this.getId()+
                "\nNome:" + this.getNome() +
                "\nPreço"+ Utilidades.doubleToString(this.getPreco());  //Chama o metodo Utilidads para formatar preco
    }
}

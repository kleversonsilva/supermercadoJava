package main;

import Modelos.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//CLASSE PRINCIPAL.
public class Mercado {
//declarar um Scanner para pegar dados do teclado.
    private static Scanner input=new Scanner(System.in);
    private static ArrayList<Produto>produtos; //Definir arrayList do produtos
    private static Map<Produto, Integer> carrinho; //Aqui È o carrinho. Map: adciona+de um item no carrinho.

    public static void main(String[] args){//declarei o metodo main
        produtos=new ArrayList<>();
        carrinho=new HashMap<>(); //HashMap: Interface(classe) q implementa o Map.

        menu();//Criar o metodo Menu
    }
    private static void menu(){
        System.out.println("--------------------------------------");
        System.out.println("----Seja Bem Vindo ao Noss Mercado----");
        System.out.println("--------------------------------------");
        System.out.println("-------Selecione Uma das Opçoes--------");
        System.out.println("-----------------------");
        System.out.println("|       Opção 1-Cadastrar  |            ");
        System.out.println("|       Opção 2-Listar  |"               );
        System.out.println("|       Opção 3-Comprar  |               ");
        System.out.println("|       Opção 4-Carrinho  |              ");
        System.out.println("|       Opção 5-Sair  |                  ");

        //definir um swith para todos.
        int option=input.nextInt(); //recebe os dados q o user digitar
        switch (option){
            case 1:
                cadastrarProdutos();
                break;
            case 2:
                listarProdutos();
                break;
            case 3:
                comprarProdutos();
                break;
            case 4:
                verProdutos();
                break;
            case 5:
                System.out.println("Obrigado Pela compra!!");
                System.exit();

                default:    //Se digitar opcao invalido
            System.out.println("OPÇÃO INEXISTENTE, TENDE NOVAMENTE");
            menu();
            break;
        }
    }
    //Começar Cadastrar os produtos
    private static
}



  # Projeto - API de um Software para Supermercado

Esta API simples tem como objetivo principal o cadastro de produtos e a realização de vendas, simulando o backend de um software para supermercado.

## Visão Geral

Este projeto demonstra a implementação de uma API em Java para gerenciar o estoque e as vendas de um supermercado. Ele oferece funcionalidades para clientes e para o próprio supermercado, permitindo a interação com produtos e o processo de compra.

## Tecnologias Utilizadas

*   **Linguagem de Programação:** Java
*   **Controle de Versão:** Git
*   **Repositório:** GitHub

## Funcionalidades

A API oferece as seguintes funcionalidades, divididas entre as ações que podem ser realizadas por um cliente e pelo supermercado:

### Clientes

*   **Listar Produtos:** Permite aos clientes visualizar a lista de produtos disponíveis no supermercado.
*   **Comprar Produtos:** Permite aos clientes adicionar produtos ao carrinho e efetuar a compra.
*   **Ver Carrinho:** Permite aos clientes visualizar os produtos que foram adicionados ao carrinho antes de finalizar a compra.
*   **Finalizar Compra:** Processa a compra, atualizando o estoque e registrando a venda.

### Supermercado

*   **Cadastrar Produto:** Permite ao supermercado adicionar novos produtos ao estoque, incluindo informações como nome, descrição, preço, etc.
*   **Remover Produto:** Permite ao supermercado remover produtos do estoque.
*   **Gerenciar Estoque:** (Implícito) A API deve gerenciar o estoque automaticamente após cada venda.
*   **Finalizar Compra:**

## Como Executar o Projeto (Instruções)

Como este é um projeto de API, ele não possui uma interface gráfica direta. Para interagir com a API, você precisará usar um cliente HTTP como o Postman, Insomnia ou `curl`.

1.  **Clone o repositório:**

    ```bash
    git clone [URL inválido removido]
    ```

2.  **Importe o projeto para sua IDE Java:** (Ex: Eclipse, IntelliJ IDEA).
3.  **Configure as dependências do projeto:**
4.  **Execute o projeto:** Inicie o servidor da sua aplicação Java.
   
## Endpoints da API (Exemplo)

#Exemplo ilustração

| Método | Endpoint         | Descrição                                                                 | Request Body (Exemplo)                                                                    | Response (Exemplo)                                                                                                                  |
| :----- | :--------------- | :-------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------- |
| POST   | `/produtos`      | Cadastra um novo produto.                                                      | `{ "nome": "Arroz", "preco": 5.00, "quantidade": 100 }`                                     | `{ "id": 123, "nome": "Arroz", "preco": 5.00, "quantidade": 100 }`                                                                  |
| GET    | `/produtos`      | Lista todos os produtos.                                                        | Nenhum                                                                                    | `[ { "id": 123, "nome": "Arroz", "preco": 5.00 }, { "id": 456, "nome": "Feijão", "preco": 3.50 } ]`                                      |
| DELETE | `/produtos/{id}` | Remove um produto pelo ID.                                                      | Nenhum                                                                                    | `{ "message": "Produto removido com sucesso" }` ou código de status 204 (No Content)                                                     |
| POST   | `/clientes/{id}/carrinho` | Adiciona um produto ao carrinho do cliente. | `{ "produtoId": 123, "quantidade": 2 }` | `{"produtos": [{"id": 123, "nome": "Arroz", "preco": 5.00, "quantidade": 2}], "total": 10.00}` |
| POST   | `/clientes/{id}/comprar` | Finaliza a compra do cliente. | Nenhum | `{ "message": "Compra finalizada com sucesso", "id_venda": 1 }` |


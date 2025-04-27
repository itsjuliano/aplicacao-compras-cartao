# 🛒 Aplicação de Compras com Cartão de Crédito

[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg?style=flat-square&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Desafio Back-end Java](https://img.shields.io/badge/Desafio-Back--end%20Java-blueviolet.svg?style=flat-square)](https://education.oracle.com/java-se-path/course/ojp-java-se-programming-i)

<p align="center">
  Uma aplicação Java simples para simular o processo de compras utilizando um cartão de crédito, desenvolvida como um desafio prático no curso de back-end em Java.
</p>

---

## ✨ Funcionalidades Principais

* **Definição de Limite:** Inicialize o cartão de crédito com um limite desejado.
* **Registro de Compras:** Adicione itens ao carrinho, informando a descrição e o valor.
* **Validação de Saldo:** O sistema verifica automaticamente se há saldo disponível antes de confirmar cada compra.
* **Controle de Gastos:** O saldo do cartão é atualizado em tempo real após cada compra aprovada.
* **Listagem Detalhada:** Visualize todas as compras realizadas, ordenadas por valor.
* **Informações Financeiras:** Acompanhe o total gasto e o saldo restante do seu cartão.

## 🚀 Como Executar

Para experimentar a aplicação, siga estes passos:

1.  **Clone o Repositório:**
    ```bash
    git clone <https://github.com/itsjuliano/aplicacao-compras-cartao.git>
    cd seu-projeto
    ```

2.  **Compile o Código Java:**
    Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina. Navegue até o diretório `src` e compile os arquivos `.java`:
    ```bash
    javac br/com/codewithjuliano/compras/modelos/*.java
    javac br/com/codewithjuliano/compras/principal/Principal.java
    ```
    Ou, se preferir, você pode compilar a partir da raiz do projeto:
    ```bash
    javac src/br/com/codewithjuliano/compras/modelos/*.java src/br/com/codewithjuliano/compras/principal/Principal.java
    ```

3.  **Execute a Aplicação:**
    Execute a classe principal `Principal`:
    ```bash
    java br.com.codewithjuliano.compras.principal.Principal
    ```
    Ou, a partir da raiz do projeto:
    ```bash
    java -cp src br.com.codewithjuliano.compras.principal.Principal
    ```

    Siga as instruções no console para interagir com o programa.

## 🛠️ Conceitos Aplicados

Este projeto demonstra a aplicação prática de diversos conceitos da Programação Orientada a Objetos (POO) em Java, incluindo:

* **Classes e Objetos:** `CartaoDeCredito`, `Compra` e `Principal`.
* **Atributos e Métodos:** Modelagem do estado e comportamento dos objetos.
* **Encapsulamento:** Proteção dos dados internos das classes.
* **Construtores:** Inicialização adequada dos objetos.
* **Polimorfismo:** Através da implementação da interface `Comparable` na classe `Compra` para ordenação.
* **Estruturas de Dados:** Utilização de `ArrayList` para armazenar dinamicamente as compras.
* **Entrada e Saída de Dados:** Interação com o usuário através da classe `Scanner`.
* **Lógica Condicional e Repetição:** Controle do fluxo da aplicação e iteração sobre as compras.

## 🎓 Desafio do Curso de Back-end em Java

Este projeto foi desenvolvido como parte de um desafio proposto durante o curso de back-end em Java, com o objetivo de consolidar os conhecimentos adquiridos sobre a linguagem e os princípios da POO.


---

Feito com ❤️ por  @itsjuliano

# Atividade 01 - Minha Primeira API com Spring Boot

## 🎯 Objetivo da Aplicação

Este projeto é uma API REST simples desenvolvida com Spring Boot. O objetivo é demonstrar a criação de dois endpoints básicos sem a necessidade de um banco de dados, retornando uma mensagem de boas-vindas e uma mensagem personalizada com o nome do aluno.

## 🛠️ Tecnologias Utilizadas

- Java 25
- Spring Boot
- Maven

## 🚀 Como Executar Localmente

Para executar este projeto em sua máquina local, siga os passos abaixo:

1.  **Pré-requisitos:**
    * Ter o Java (JDK 17 ou superior) instalado.
    * Ter o Git instalado.

2.  **Clonar o Repositório:**
    ```bash
    git clone https://github.com/DouglasFernan/atividade_spring_01
    cd SC_atividade_01
    ```

3.  **Executar a Aplicação:**
    * Abra o projeto em uma IDE Java (como o IntelliJ IDEA).
    * Aguarde a IDE baixar as dependências do Maven.
    * Encontre a classe principal `ScAtividade01Application.java` e execute-a.
    * A aplicação estará disponível em `http://localhost:8080`.

## 🌐 Endpoints Criados

A API possui dois endpoints, ambos acessíveis através do prefixo `/api`.

### 1. Mensagem de Boas-Vindas

Retorna uma mensagem de boas-vindas genérica.

-   **URL:** `/api/bemvindo`
-   **Método:** `GET`
-   **Exemplo de Resposta:**
    ```
    Seja muito bem-vindo(a) à minha primeira API com Spring Boot!
    ```

### 2. Mensagem Personalizada

Retorna uma saudação personalizada com o nome do aluno fornecido na URL.

-   **URL:** `/api/bemvindo/{nome}`
-   **Método:** `GET`
-   **Parâmetro da URL:** `nome` (String)
-   **Exemplo de Requisição:**
    ```
    http://localhost:8080/api/bemvindo/Carlos
    ```
-   **Exemplo de Resposta:**
    ```
    Olá, Carlos! Seja bem-vindo(a)!
    ```

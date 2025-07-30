# Valor médio de veículos 📰

Este projeto foi desenvolvido para realizar consultas do valor médio de determinados veículos, nele você consegue consultar 3 categorias: moto, carro e caminhão. Com esta aplicação é possível consultar o ano, marca, modelo, tipo de combustível e o valor médio no mercado dos veículos selecionados. 🚛

Para esta aplicação a ferramenta utilizada foi o IntelliJ-IDEA e a consulta do valor médio de veículos seguiu de acordo com a tabela FIPE, também foram utilizados conceitos como coleções, listas, streams no Java, API para consulta e biblioteca Gson para manipular JSON.

♦ Conhecimentos adquiridos do programa Oracle Next Education/ONE - Alura, turma G8 - fase de especialização em Back-End.

## 🖼 Demonstração

<img width="1782" height="647" alt="ConsultaVeiculo" src="https://github.com/user-attachments/assets/40dbbcb2-3916-4145-b187-928132842fa1" />
<img width="1830" height="921" alt="ConsultaMarca(2)" src="https://github.com/user-attachments/assets/3060b0ff-0a33-4abb-a2dc-32acb514a1b4" />
<img width="1835" height="917" alt="ConsultaModelo(3)" src="https://github.com/user-attachments/assets/c3bfe4de-58ac-454d-8e18-5860a62a07e0" />
<img width="1838" height="933" alt="CodigoModelo(4)" src="https://github.com/user-attachments/assets/4d871f7b-5995-4d98-98c3-2742ce9cf268" />
<img width="1817" height="930" alt="ConsultaFinalizada(5)" src="https://github.com/user-attachments/assets/6df06f88-14f2-4a4c-9957-94e12b7b9fcb" />



## 📌 Funcionalidades

- ✅ Busca valor médio de veículos via FIPE API HTTP REST.
- 🔄 Implementação de Lambdas e Streams.
- 📊 Manipulação de dados JSON com Gson.

## Tecnologias Utilizadas 🛠️

- **Java** 21 (Java SE)
- **FIPE API HTTP REST**
- **Gson** (para serialização e desserialização de JSON)
- **IntelliJ-IDEA**
- **Postman**
- **Spring Framework**

## Estrutura do Código 💻

- **ConsumoAPI**

Esta classe é responsável por realizar requisições HTTP à FIPE API HTTP REST. Ela utiliza o HttpClient para enviar requisições HTTP, HttpRequest para configurar as URLs das requisições e HttpResponse para capturar as respostas da API. As funções dessa classe são usadas para buscar os códigos dos veículos da API e retornar com as informações. As excessões são implementadas para evitar erros durante o processo de reprodução dos códigos.

- **Principal**

Nesta classe você encontra Scanner para realizar a leitura da opção digitada pelo usuário, biblioteca Gson para complementar a classe de requisição da API, condicionais (if e else), estrutura de Lambdas e Stream.

## Fontes utilizadas: 

📝API de referência: https://publicapis.dev/category/vehicle 

📍 API utilizada: https://deividfortuna.github.io/fipe/?ref=public_apis&utm_medium=website

📑 Web Site para ler API: [https://parallelum.com.br/fipe/api/v1/](https://www.postman.com/#watch-demo)

📥 Dowload do projeto inicial Spring: https://start.spring.io/

📌 Código HTTPS para API e Json: https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html

📚 Biblioteca Gson: https://mvnrepository.com/artifact/com.google.code.gson/gson

## Como Executar o Projeto ▶️

1. Clone este repositório:
   `bash
   git clone https://github.com/carolinesvazz/ConversorDeMoedas

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para utilizá-lo e modificá-lo conforme necessário.

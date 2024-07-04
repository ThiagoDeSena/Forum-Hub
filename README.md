# FórumHub API
![Fórum Hub](https://github.com/ThiagoDeSena/Forum-Hub/assets/110785400/7030cf6f-0f52-4be0-90cc-391384fdf964)
![Badge Concluído](http://img.shields.io/static/v1?label=STATUS&message=CONCLUÍDO&color=GREEN&style=for-the-badge)
![Badge Linguagem](http://img.shields.io/static/v1?label=LINGUAGEM&message=JAVA&color=yellow&style=for-the-badge)
![Badge Linguagem](http://img.shields.io/static/v1?label=API&message=Fórum_hub&color=blue&style=for-the-badge)

## Descrição do projeto 

<p align="justify">
O FórumHub é uma API REST desenvolvida em Java utilizando Spring Boot, que simula um fórum de discussão. Nesta API, os usuários podem criar, visualizar, 
atualizar e deletar tópicos de discussão, perfis, respostas, cursos e usuários. A partir de agora, apenas usuários autenticados podem interagir com a API. 
Este projeto é parte do desafio Challenge Back End.
</p>

## Funcionalidades

A API FórumHub permite as seguintes operações:

- POST: Criação de um Tópico.
- GET: Listagem dos Tópicos criados.
- GET: Detalhamento de um Tópico pelo id.
- PUT: Atualização de um tópico.
- DELETE: Exclução Lógica de um tópico pelo id.
- POST: Criação de usuário autorizado a acessar a API.

## Tecnologias Utilizadas

:heavy_check_mark: `Java:` Linguagem de programação usada para desenvolver a API. 

:heavy_check_mark: `Spring Boot:` Framework utilizado para construir a API REST..

:heavy_check_mark: `Spring Security:` Módulo de segurança do Spring utilizado para autenticação e controle de acesso..

:heavy_check_mark: `JWT (JSON Web Token):` Utilizado para autenticação stateless e segura..

:heavy_check_mark: `auth0:` Serviço de gestão de identidade e autenticação usada para integrar e gerenciar as credenciais dos usuários.

:heavy_check_mark: `Spring Doc:` Utilizado para geração automática de documentação da API.

:heavy_check_mark: `MySQL:` Banco de dados relacional para armazenamento dos dados.

## Diagrama do Banco de Dados

![Tópico](https://github.com/ThiagoDeSena/Forum-Hub/assets/110785400/70872da6-ea07-4446-80ce-8ef87854bf08)

## Como Configurar e Executar

<h3>Configurar Banco de Dados MySQL</h3>

 1.Crie um banco de dados no MySQL:

  ```CREATE DATABASE forumhub;```

 2.Configure as credenciais do banco de dados no arquivo ```src/main/resources/application.properties:```

 ```
spring.application.name=ForumHub
spring.datasource.url=jdbc:mysql://localhost/forum_hub
spring.datasource.username=root
spring.datasource.password=12345
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

api.security.token.secret=${JWT_SECRET:12345678}
```
  3.Acesse a aplicação em ```http://localhost:8080```.

  4.A documentação da API gerada pelo Spring Doc pode ser acessada em ```http://localhost:8080/swagger-ui.html```.

  ![swagger-forumHub](https://github.com/ThiagoDeSena/Forum-Hub/assets/110785400/f1cc7dda-4f38-4857-8de8-22c5552c0258)


 ## Endpoints da API

<h3>Criar um novo tópico</h3>

- Endpoint: ```POST /topicos```
- Descrição: Cria um novo tópico.
- Request Body:
  ```
  {
    "titulo":"Dúvida em Cloud",
    "mensagem":"estou com dúvidas em Cloud",
    "autor":"Eduardo",
    "curso":"Google Cloud"
  }
  ```
- Response:
  ```
  {
    "id": 5,
    "titulo": "Dúvida em Cloud",
    "data": "2024-07-04T17:03:38.2465849",
    "mensagem": "estou com dúvidas em Cloud",
    "autor": "Eduardo",
    "curso": "Google Cloud"
  }
  ```
![post da API](https://github.com/ThiagoDeSena/Forum-Hub/assets/110785400/e5687ca7-0dec-45f9-8658-ec3bb8a4e0b8)


<h3>Mostrar todos os tópicos criados</h3>

- Endpoint: ```GET /topicos```
- Descrição: Retorna todos os tópicos..
- Response:
  ```
  {
    "content": [
        {
            "id": 1,
            "titulo": "Achei o erro",
            "mensagem": "Resolvir o problema",
            "data": "2024-07-01T10:38:46.686878",
            "status": true,
            "autor": "Mônica",
            "curso": "Css"
        },
        {
            "id": 2,
            "titulo": "Dúvida em Java",
            "mensagem": "estou com dúvidas em Java",
            "data": "2024-07-02T16:20:04.63364",
            "status": true,
            "autor": "Mônica",
            "curso": "Java"
        },
        {
            "id": 3,
            "titulo": "Dúvida solucionada",
            "mensagem": "Entendi agora",
            "data": "2024-07-02T16:20:31.439853",
            "status": true,
            "autor": "Eduardo",
            "curso": "JavaScript"
        },
        {
            "id": 4,
            "titulo": "Dúvida em Python",
            "mensagem": "estou com dúvidas em Python",
            "data": "2024-07-04T16:59:10.720103",
            "status": true,
            "autor": "Eduardo",
            "curso": "JavaScript"
        },
        {
            "id": 5,
            "titulo": "Dúvida em Cloud",
            "mensagem": "estou com dúvidas em Cloud",
            "data": "2024-07-04T17:03:38.246585",
            "status": true,
            "autor": "Eduardo",
            "curso": "Google Cloud"
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 10,
        "sort": {
            "empty": false,
            "sorted": true,
            "unsorted": false
        },
        "offset": 0,
        "unpaged": false,
        "paged": true
    },
    "totalPages": 1,
    "totalElements": 5,
    "last": true,
    "size": 10,
    "number": 0,
    "sort": {
        "empty": false,
        "sorted": true,
        "unsorted": false
    },
    "numberOfElements": 5,
    "first": true,
    "empty": false
  }
  ```
![GET](https://github.com/ThiagoDeSena/Forum-Hub/assets/110785400/33bc4417-d232-4683-9979-786e11b0d063)

<h3>Mostrar um tópico específico</h3>

- Endpoint: ```GET /topicos/{id}```
- Descrição: Retorna um tópico pelo ID.
- Response:
  ```
  {
    "id": 1,
    "titulo": "Achei o erro",
    "data": "2024-07-01T10:38:46.686878",
    "mensagem": "Resolvir o problema",
    "autor": "Mônica",
    "curso": "Css"
  }
  ```
![get{id}](https://github.com/ThiagoDeSena/Forum-Hub/assets/110785400/1e2b145d-29c5-4b60-82a1-93668052f295)

<h3>Atualizar um Tópico</h3>

- Endpoint: ```PUT /topicos/{id}```
- Descrição: Atualiza um tópico pelo ID.
- Request Body:
  ```
  {
    "titulo":"Dúvida aberta ainda",
    "mensagem":"Ainda não entendi"
  }
  ```
- Response:
  ```
  {
    "id": 4,
    "titulo": "Dúvida aberta ainda",
    "data": "2024-07-04T16:59:10.720103",
    "mensagem": "Ainda não entendi",
    "autor": "Eduardo",
    "curso": "JavaScript"
  }
  ```
![put](https://github.com/ThiagoDeSena/Forum-Hub/assets/110785400/40c55fc2-63e8-4f68-b087-03cc2d196710)

<h3>Deletar um Tópico</h3>

- Endpoint: ```DELETE /topicos/{id}```
- Descrição: Deleta logicamente um tópico pelo ID.


![Delete](https://github.com/ThiagoDeSena/Forum-Hub/assets/110785400/89020e1d-b4ed-4824-b5cf-fb42aa305786)


## Documentação da API

A documentação da API gerada pelo Spring Doc pode ser acessada em ```http://localhost:8080/swagger-ui.html```.

## Desenvolvedores

[<img src="https://avatars.githubusercontent.com/u/110785400?v=4" width=115><br><sub>Thiago De Sena</sub>](https://www.linkedin.com/in/thiago-de-sena-ab5b09179/)



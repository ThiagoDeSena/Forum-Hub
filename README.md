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
    "titulo":"Dúvida em Python",
    "mensagem":"estou com dúvidas em Python",
    "autor":"Eduardo",
    "curso":"JavaScript"
  }
  ```
- Response:
  ```
  
  ```



## Desenvolvedores

[<img src="https://avatars.githubusercontent.com/u/110785400?v=4" width=115><br><sub>Thiago De Sena</sub>](https://www.linkedin.com/in/thiago-de-sena-ab5b09179/)



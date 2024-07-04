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

  <CREATE DATABASE forumhub;>

 ## Observações

 - Para realização do desafio faremos o consumo de uma API, documentada nesse link https://deividfortuna.github.io/fipe/.

- De acordo com o escolhido (carro, moto, ou caminhão) vamos fazer uma chamada a um dos endpoints abaixo para buscar as marcas:

https://parallelum.com.br/fipe/api/v1/carros/marcas

https://parallelum.com.br/fipe/api/v1/motos/marcas

https://parallelum.com.br/fipe/api/v1/caminhoes/marcas

- O retorno dessa requisição será uma lista com código e marca desejada. Caso o usuário queira por exemplo fazer uma consulta a modelos de carros da Fiat, que possui o código 21, terá que fazer uma nova requisição para o endpoint:
  
https://parallelum.com.br/fipe/api/v1/carros/marcas/21/modelos

- Feito isso, irá escolher um código de modelo, por exemplo esse Palio Weekend Stile 1.6 mpi 16V 4p, representado pelo código 560. Então deverá fazer uma terceira requisição para o endpoint:

https://parallelum.com.br/fipe/api/v1/carros/marcas/21/modelos/560/anos

- Para saber a avaliação para cada ano disponível, teremos que fazer requisições pelo código por ano, onde obteremos um retorno similar ao que é mostrado abaixo:
  
https://parallelum.com.br/fipe/api/v1/carros/marcas/21/modelos/560/anos/2003-1

![image](https://github.com/ThiagoDeSena/Tabela-Fipe/assets/110785400/882957d0-045a-42cf-a0b8-26c26447c1da)

- Para podermos exibir em nossa aplicação as avaliações de todos os anos para esse modelo, será necessário trabalhar com as coleções e estruturas de repetição para poder exibir já todos as avaliações de todos os anos para o nosso usuário.
- Utilize a biblioteca Jackson para a desserialização dos dados.
- Modele as classes de acordo com o necessário para representar as marcas, modelos e dados dos veículos.
- Relembre os conceitos vistos no curso para filtrar os modelos por um trecho do nome.


## Desenvolvedores

[<img src="https://avatars.githubusercontent.com/u/110785400?v=4" width=115><br><sub>Thiago De Sena</sub>](https://www.linkedin.com/in/thiago-de-sena-ab5b09179/)



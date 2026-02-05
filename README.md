# Projeto | CRUD com Java 17 e Spring Boot 4.0.2 

Objetivo do projeto:

Realizar um CRUD utilizando Java com Spring Boot e realizar criação de uma API Rest com todos os padrões do mercado

# Como iniciar o projeto

# Para iniciar o projeto, execute o comando (caso nao tenha Docker):
./mvnw spring-boot:run

# Para docker(Rode os seguintes comandos):

docker build -t projeto-crud .
docker run -p 8080:8080 projeto-crud


# Para rodar o test de Students:
mvn test

Com esse comando vai rodar o test da classe Student
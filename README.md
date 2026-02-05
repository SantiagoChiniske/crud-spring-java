
Para iniciar o projeto, execute o comando (caso nao tenha Docker):\
./mvnw spring-boot:run

Para docker(Rode os seguintes comandos):

docker build -t projeto-crud .
docker run -p 8080:8080 projeto-crud


Para rodar o test de Students:
mvn test

Ira rodar o test da classe Student
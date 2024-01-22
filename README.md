# Estudo de Java - Primeira API
# Sobre o projeto

Essa foi minha primeira API em Java Spring Boot, apenas para estudos. A ideia da API é simplesmente um serviço de transação de dinheiro, tendo dois tipos de usuários:



>Os comuns - Estes usuários podem realizar e receber transferências, userType - COMMON.

>Os lojistas - Estes usuários podem apenas receber transferências, userType - MERCHANT.

Utilizei como base para autorização de transações um serviço externo mock, sem implementação de JWT já que a ideia é ser um primeiro contato com Java.

Para a notificação de transação com sucesso ou erro, foi feito também com um serviço externo mock.

Nesse primeiro momento não foi utilizado nenhum banco, apenas cache utilizando H2.
## Rotas

A ideia é ter poucas rotas, sendo elas ->
>/users - Essa rota é para criação de usuários e listagem. Não é possível criar usuários com o mesmo documento ou e-mail. 

>/transactions - Essa rota é para transações monetárias, onde dois usuários trocam valores, sendo que apenas usuários
> do tipo COMMON podem realizar transferências.

# Exemplo de objeto - Criar Usuário
```
{
    "firstName": "Joao",
    "lastName": "Silva",
    "document": "12345678900",
    "email": "teste@teste.com",
    "userType": "COMMON",
    "balance": 50,
    "password": "teste"
}
```

# Exemplo de objeto - Realizar Transação
```
{ 
    "senderId": 2,
    "receiverId": 1,
    "value": 10
}
```
# Tecnologias utilizadas
- Java
- Spring Boot
- JPA
- Maven
- H2
- Lombok
# Como executar o projeto


Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/leofcaon/java-study

# mudar para o diretório do projeto
cd java-study

# compilar o projeto
./mvnw clean install

# executar o projeto
./mvnw spring-boot:run

```

# Autor

Leonardo Caon

https://www.linkedin.com/in/leonardo-caon

📚 Biblioteca Online

Sistema de gerenciamento de empréstimos de livros desenvolvido com Spring Boot e JPA.

✨ Visão Geral

Biblioteca Online é uma aplicação que permite o cadastro de usuários, livros e a gestão de empréstimos. O sistema possibilita registrar e acompanhar os livros emprestados, incluindo datas de empréstimo e devolução.

🚀 Funcionalidades

Cadastro de usuários 👤

Cadastro de livros 📚

Registro de empréstimos de livros 📖

Validação de usuários e livros existentes no banco 🔒

Painel para visualizar empréstimos ativos e histórico 📊

Persistência de dados com H2 e MySQL 🛠️

🛠️ Tecnologias Utilizadas

Java 17 ☕

Spring Boot (Web, JPA, DevTools) 🛠️

Thymeleaf (para renderização de páginas) 🌐

H2 Database (para testes) e MySQL (em produção) 🏛️

Bootstrap 5 (interface responsiva) 🎨

Lombok (redução de boilerplate) 🌟

⚙️ Como Rodar o Projeto

1. Clonar o Repositório

git clone https://github.com/seu-usuario/biblioteca-online.git
cd biblioteca-online

2. Configurar o Banco de Dados

Para ambiente de testes, não é necessário configurar nada, pois o projeto usa o H2 em memória.

Para MySQL, edite o application.properties e configure as credenciais:

spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update

3. Executar a Aplicação

./mvnw spring-boot:run # Se estiver usando Maven Wrapper
# ou
mvn spring-boot:run

A aplicação rodará em http://localhost:8080

🔄 Endpoints Principais

Usuários

GET /users - Lista todos os usuários

POST /users/salvar - Cadastra um novo usuário

Livros

GET /books - Lista todos os livros

POST /books/salvar - Cadastra um novo livro

Empréstimos

POST /loans/salvar - Realiza um empréstimo

📸 Interface Web

A aplicação conta com um painel web criado com Thymeleaf e Bootstrap, permitindo que os empréstimos sejam gerenciados diretamente pela interface.

🚀 Melhorias Futuras

Envio de notificações de devolução próxima

Implementação de autenticação e autorização com Spring Security

API REST completa para integrações

🔗 Contribuição

Sinta-se à vontade para contribuir com o projeto! Basta fazer um fork, criar um branch e enviar um PR.

🌟 Autor

Wallace Artur - GitHub

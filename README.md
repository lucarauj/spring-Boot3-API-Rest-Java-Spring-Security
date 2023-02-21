[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/spring-Boot3-API-Rest-Java-Spring-Security/blob/main/LICENSE)

<h1 align="center"> Curso Spring Boot 3 API Rest em Java - Spring Security: </h1>
<h2 align="center"> Gerenciando uma clínica médica </h2>

<p align="center"><img width="150px" src="https://github.com/lucarauj/assets/blob/main/ApiJavaSpring.png" /></p>

### 👉 [LINK DO PROJETO BASE 🖱](https://github.com/lucarauj/spring-Boot3-API-Rest-Java) </h3>

<br>

## Alterações - Parte I

- Utilização da classe ResponseEntity para personalizar os retornos dos métodos de uma classe Controller;
- Modificação do código HTTP devolvido nas respostas da API;
- Inclusão de cabeçalhos nas respostas da API;
- Utilização dos códigos HTTP mais apropriados para cada operação realizada na API.

<br>

### 🖱 Site que ilustra códigos HttpStatus 👉 https://http.garden/

<br>

## Alterações - Parte II

- Criação de classe para isolar o tratamento de exceptions da API, com a utilização da anotação @RestControllerAdvice;
- Utilização da anotação @ExceptionHandler para indicar qual exception determinado método da classe de tratamento de erros deve capturar;
- Tratamento de erros do tipo 404 (Not Found) na classe de tratamento de erros;
- Tratamento de erros do tipo 400 (Bad Request), para erros de validação do Bean Validation, na classe de tratamento de erros;
- Simplificação do JSON devolvido pela API em casos de erro de validação do Bean Validation.

<br>

### ⚙ Configurando ```aplication.properties```:

```
server.error.include-stacktrace=never
```
<br>

- 🖱 Documentação Spring Boot - Propriedades 👉 https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html

<br>

### ✅ Forma de customizar retorno do Bean Validation:

- Na classe:
```
@NotBlank(message = "Nome é obrigatório")
String nome
```
- No ```ValidationMessages.properties``` :
```
nome.obrigatorio=Nome é obrigatório
```

## Alterações - Parte III (Spring Security)

- Add Spring Security ao projeto;
- Implementação do processo de autenticação na API (Stateless) utilizando as classes e configurações do Spring Security.

<br>

### 🛠 Configurando ```pom.xml```:

```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
</dependency>
<dependency>
	<groupId>org.springframework.security</groupId>
	<artifactId>spring-security-test</artifactId>
	<scope>test</scope>
</dependency>
```

### ✅ Para trabalhar com senhas no banco de dados 👉 

Hashing: (função matemática que converte um texto em outro texto totalmente diferente e de difícil dedução)

<br>

### ✔ Principais algoritmos recomendados atualmente:

- Bcrypt* (usado no projeto: https://bcrypt-generator.com/)
- Scrypt
- Argon2
- PBKDF2

<br>

## Alterações - Parte IV (JSON Web Token)

- Add biblioteca Auth0 java-jwt como dependência do projeto;
- Utilização da Auth0 para realizar a geração de um token na API;
- Injetação de propriedade do arquivo application.properties em uma classe gerenciada pelo Spring, utilizando a anotação @Value;
- Devolução de um token gerado na API quando um usuário se autenticar nela.


- 🖱 https://jwt.io/libraries?language=Java (com.auth0)
- 🖱 https://github.com/auth0/java-jwt

<br>

### 🛠 Configurando ```pom.xml```:

```
<dependency>
  <groupId>com.auth0</groupId>
  <artifactId>java-jwt</artifactId>
  <version>4.3.0</version>
</dependency>
```
### ⚙ Populando banco dados com um Usuário (id-Email-Senha):

```
insert into usuarios values(1, 'lukas@gmail.com', '$2a$12$RzI2dsvj41.9zAQj5p5Jje5Z9Hl/D6QLB0OeWpIV9WteHi5VCkIz2')
```

## Alterações - Parte V

- Utilização de Filters em uma requisição;
- Implementação de um filter criando uma classe que herda da classe OncePerRequestFilter, do Spring;
- Utilização da biblioteca Auth0 java-jwt para realizar a validação dos tokens recebidos na API;
- Desenvolvimento do processo de autenticação da requisição, utilizando a classe SecurityContextHolder, do Spring;
- Liberação e restrição das requisições, de acordo com a URL e o verbo do protocolo HTTP.

<br>

### 📝 Anotações utilizadas no projeto (Parte II):

<br>

### 🚀 Principais tecnologias utilizadas no projeto:

<div style="display: inline_block"><br>
<img align="center" alt="Lucarauj-Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg">
<img align="center" alt="Lucarauj-Postman" height="50" width="90" src="https://github.com/lucarauj/assets/blob/main/postman.png">
<img align="center" alt="Lucarauj-Spring" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg">
<img align="center" alt="Lucarauj-SpringBoot" height="40" width="110" src="https://github.com/lucarauj/assets/blob/main/SpringBoot.jpeg">
<img align="center" alt="Lucarauj-Maven" height="50" width="60" src="https://github.com/lucarauj/assets/blob/main/Maven-Apache.svg">
<img align="center" alt="Lucarauj-Mysql" height="50" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original-wordmark.svg">
</div>

<br>

## Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>

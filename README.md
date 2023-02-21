Spring Boot 3 API Rest em Java: Gerenciando uma clínica médica

Tecnologias:

- Spring Boot 3
- Java 17
- Lombok
- MySQL/Flyway
- JPA/Hibernate
- Maven
- Postman

### Projeto base: https://start.spring.io/

Dependências:

Spring boot DevTools
Lombok
Spring Web
Validation
MySQL Driver
Spring Data JPA
Flyway Migration

Anotações:

- @RestController
- @RequestMapping
- @GetMapping
- @PostMapping
- @RequestBody
- @Table
- @Entity
- @Id
- @GeneratedValue
- @Enumerated
- @Embedded
- @Embeddable
- @Getter
- @NoArgsConstructor
- @AllArgsConstructor
- @EqualsAndHashCode
- @Autowired
- @Transactional
- @NotBlank: um atributo do tipo String não pode ser nulo e nem vazio;
- @Email
- @Pattern
- @NotNull
- @Valid
- @GenerationType
- @PageableDefault
- @PutMapping
- @DeleteMapping
- @PathVariable

### Configurando o arquivo application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api
spring.datasource.username= root
spring.datasource.password=

### Iniciando o banco de dados com o Xamp

### Configuração para comandos SQL disparados no banco de dados -> application.properties:

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
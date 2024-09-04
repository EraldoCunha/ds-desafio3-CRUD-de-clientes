# CRUD de clientes

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/EraldoCunha/ds-desafio3-CRUD-de-clientes/blob/main/LICENSE)

# Sobre o projeto

Projeto usando Spring Boot contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo.
- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

## Classe Client
![Modelo Conceitual](https://github.com/EraldoCunha/assets/blob/main/ds-desafio3-CRUD-de-clientes/Modelo%20de%20dom%C3%ADnio%20Client.PNG)

## Padrão Arquitetural em Camadas utilizado no projeto
![Padrão Camadas](https://github.com/EraldoCunha/assets/blob/main/ds-desafio3-CRUD-de-clientes/Padr%C3%A3o%20de%20camadas.PNG)

## Mais sobre o projeto

### As seguintes exceções foram tratadas:
- Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.
- Erro de validação, retornando código 422 e mensagens customizadas para cada campo inválido.

### Regras de Validação:
- **Nome**: não pode ser vazio.
- **Data de nascimento**: não pode ser data futura.

# Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- H2 Database
- Maven
- Bean Validation
- Postman

# Autor

Eraldo José de Almeida Cunha

<a href="https://www.linkedin.com/in/eraldojacunha/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

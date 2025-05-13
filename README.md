# Sistema de Biblioteca

Sistema simples de biblioteca para a 1ª Avaliação de Aplicação de Banco de Dados.

## Estrutura do Projeto
- `model`: Classes que representam as entidades do sistema
  - `Aluno.java`: Representa um aluno com matrícula e nome
  - `Publicacao.java`: Representa uma publicação (livro, revista) com código, título, ano, autor e tipo
  - `Emprestimo.java`: Representa um empréstimo, relacionando aluno e publicação com datas de empréstimo e devolução
- `dao`: Classe de acesso a dados
  - `EmprestimoDAO.java`: Implementa operações CRUD (Create, Read, Update, Delete) para empréstimos
- `test`: Classe de teste
  - `TesteEmprestimoDAO.java`: Demonstra o uso do DAO com exemplos de todas as operações

## Implementação dos Requisitos

### 1. Mapeamento SQL (0.5 pts)
Implementado no arquivo `schema.sql` que define as tabelas:
- `Aluno`: Armazena dados dos alunos
- `Publicacao`: Armazena informações sobre livros e revistas
- `Emprestimo`: Gerencia os empréstimos, com chaves estrangeiras para Aluno e Publicacao

### 2. Mapeamento JPA (0.5 pts)
Classes do pacote `model` implementam o mapeamento objeto-relacional usando anotações JPA:
- `@Entity`: Marca as classes como entidades
- `@Id`: Define as chaves primárias
- `@ManyToOne`: Mapeia os relacionamentos entre entidades
- `@Temporal`: Define o formato das datas

### 3. Classe DAO (1 pt)
`EmprestimoDAO.java` implementa todas as operações necessárias:
- `salvar()`: Cria um novo empréstimo
- `atualizar()`: Modifica um empréstimo existente
- `deletar()`: Remove um empréstimo
- `listarTodos()`: Retorna todos os empréstimos

### 4. Classe de Testes (1 pt)
`TesteEmprestimoDAO.java` demonstra todas as operações do DAO:
1. Cria e salva um novo empréstimo
2. Lista todos os empréstimos
3. Atualiza a data de devolução
4. Remove o empréstimo

## Tecnologias Utilizadas
- Java
- JPA/Hibernate para persistência
- H2 Database (banco de dados em memória)
- Maven para gerenciamento de dependências

## Como Testar (Passo a Passo)

### Pré-requisitos
1. Java JDK instalado (versão 8 ou superior)
2. Eclipse IDE

### Passos para Testar
1. Abra o Eclipse
2. Vá em File -> Import -> Maven -> Existing Maven Projects
3. Selecione a pasta do projeto
4. Aguarde o Eclipse baixar as dependências
5. Encontre a classe `TesteEmprestimoDAO` em:
   - src/main/java/br/atividade/test/TesteEmprestimoDAO.java
6. Clique com botão direito na classe
7. Selecione Run As -> Java Application

### O que vai acontecer quando executar
Ao executar a classe de teste, você verá as seguintes mensagens no console:
1. "1. Empréstimo salvo" - Um novo empréstimo foi criado
2. "2. Lista de empréstimos: 1" - O sistema listou os empréstimos
3. "3. Empréstimo atualizado" - A data de devolução foi atualizada
4. "4. Empréstimo deletado" - O empréstimo foi removido

### Verificando o Banco de Dados
O sistema usa o banco H2, que salva os dados automaticamente. Não é necessário fazer nenhuma configuração adicional.

## Autores
Miguel tobias Matricula:202307907289  
Pedro Matricula:

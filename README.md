# Sistema de Biblioteca

Sistema simples de biblioteca para a 1ª Avaliação de Aplicação de Banco de Dados.

## Estrutura
- `model`: Classes Aluno, Publicacao e Emprestimo
- `dao`: Classe EmprestimoDAO com operações CRUD
- `test`: Classe TesteEmprestimoDAO

## Tecnologias
- Java
- JPA/Hibernate
- H2 Database

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

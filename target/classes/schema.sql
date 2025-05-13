-- Tabela Aluno
CREATE TABLE Aluno (
    matriculaAluno INT PRIMARY KEY,
    nome VARCHAR(100)
);

-- Tabela Publicacao
CREATE TABLE Publicacao (
    codigoPub INT PRIMARY KEY,
    titulo VARCHAR(100),
    ano INT,
    autor VARCHAR(100),
    tipo VARCHAR(50)
);

-- Tabela Emprestimo
CREATE TABLE Emprestimo (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    aluno_matriculaAluno INT,
    publicacao_codigoPub INT,
    dataEmprestimo DATE,
    dataDevolucao DATE,
    FOREIGN KEY (aluno_matriculaAluno) REFERENCES Aluno(matriculaAluno),
    FOREIGN KEY (publicacao_codigoPub) REFERENCES Publicacao(codigoPub)
);
package br.atividade.test;

import br.atividade.dao.EmprestimoDAO;
import br.atividade.model.Aluno;
import br.atividade.model.Emprestimo;
import br.atividade.model.Publicacao;
import java.util.Date;
import java.util.List;

public class TesteEmprestimoDAO {
    public static void main(String[] args) {
        EmprestimoDAO dao = new EmprestimoDAO();

        // 1. Criar e salvar um empréstimo
        Aluno aluno = new Aluno(1, "Maria");
        Publicacao livro = new Publicacao(1, "Java Básico", 2024, "Autor", "Livro");
        Emprestimo emprestimo = new Emprestimo(aluno, livro, new Date(), new Date());
        dao.salvar(emprestimo);
        System.out.println("1. Empréstimo salvo");

        // 2. Listar empréstimos
        List<Emprestimo> lista = dao.listarTodos();
        System.out.println("2. Lista de empréstimos: " + lista.size());

        // 3. Atualizar empréstimo
        emprestimo.setDataDevolucao(new Date());
        dao.atualizar(emprestimo);
        System.out.println("3. Empréstimo atualizado");

        // 4. Deletar empréstimo
        dao.deletar(emprestimo.getId());
        System.out.println("4. Empréstimo deletado");
    }
}

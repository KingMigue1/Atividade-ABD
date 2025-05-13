package br.atividade.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

import br.atividade.model.Emprestimo;

public class EmprestimoDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaPU");

    public void salvar(Emprestimo e) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizar(Emprestimo e) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();
        em.close();
    }

    public void deletar(Long id) {
        EntityManager em = emf.createEntityManager();
        Emprestimo e = em.find(Emprestimo.class, id);
        if (e != null) {
            em.getTransaction().begin();
            em.remove(e);
            em.getTransaction().commit();
        }
        em.close();
    }

    public List<Emprestimo> listarTodos() {
        EntityManager em = emf.createEntityManager();
        List<Emprestimo> lista = em.createQuery("from Emprestimo", Emprestimo.class).getResultList();
        em.close();
        return lista;
    }
}

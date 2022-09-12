package br.com.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.dominio.Agendamento;

public class RepositorioAgendamento {
	
	
	EntityManagerFactory emf;
	EntityManager em;	
	
	
	public RepositorioAgendamento() {
		emf = Persistence.createEntityManagerFactory("persi-jpa");
		em = emf.createEntityManager();
	}
	
	public void salvar(Agendamento agendamento) {
		em.getTransaction().begin();
		em.merge(agendamento);
		em.getTransaction().commit();
		emf.close();
	}
	
	
	public void remover(Agendamento a) {
		em.getTransaction().begin();
		em.remove(a);
		em.getTransaction().commit();
		emf.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Agendamento> listarTodos(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select agendamento from Agendamento agendamento");
		List<Agendamento> agendamentos = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return agendamentos;
		
	}
	

}

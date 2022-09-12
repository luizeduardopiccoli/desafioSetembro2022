//package br.com.aplicacao;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import dominio.Agendamento;
//
//
//public class Programa {
//
//	public static void main(String[] args) {
		
//		Agendamento a1 = new Agendamento (null, "Dr. Alberto Almeida", "Clinica Geral", 10, "11:00",
//				"Sueli Silva", "(21)99999-1234", "sueli@mail.com", "");
//		Agendamento a2 = new Agendamento (null, "Dr. Beatriz Barbosa", "Dermatologia", 15, "12:00",
//				"Teodoro Tavares", "(21)99999-1235", "teodoro@mail.com", "");
//		Agendamento a3 = new Agendamento (null, "Dr. Cristina Camargo", "Ortopedia", 20, "13:00",
//				"Ursula Utter", "(21)99999-1236", "ursula@mail.com", "");

		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persi-jpa");
//		EntityManager em = emf.createEntityManager();
		
		
		//CREATE
//		em.getTransaction().begin();
//		em.persist(a1);
//		em.persist(a2);
//		em.persist(a3);
//		em.getTransaction().commit();
//		System.out.println("PRONTO!");
		
		

		//READ
//		Agendamento a = em.find(Agendamento.class, 2);
//		
//		System.out.println(a);
//		
//		System.out.println("Pronto!");
		
		
		//UPDATE
//		Agendamento agendamento = new Agendamento();
//		agendamento.setId(1);
//		agendamento.setNomeMedico = "Dr. Alberto Almeida";
//		agendamento.setEspecialidade = "Clinica Geral";
//		agendamento.setDia = 10;
//		agendamento.setHorario = "12:00";
//		agendamento.setNomePaciente = "Sueli Souza";
//		agendamento.setTelefone = "(21)99999-2234";
//		agendamento.setEmail = "sueli.souza@mail.com";
//		agendamento.setObservacoes = "";
//		
//		em.getTransaction().begin();
//		em.merge(agendamento);
//		em.getTransaction().commit();
		
		


		
		//DELETE
//		Agendamento a = em.find(Agendamento.class, 2);
//		em.getTransaction().begin();
//		em.remove(p);
//		em.getTransaction().commit();

		
//		em.close();
//		emf.close();
		
//	}
//
//}

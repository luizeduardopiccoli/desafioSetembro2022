/**
 * Sistema de Agendamento
 * Autor: Luiz Eduardo Lahm Piccoli
 * criado em 07/09/2022
 */

package br.com.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nomeMedico;
	private String especialidade;
	private Integer dia;
	private String horario;
	private String nomePaciente;
	private String telefone;
	private String email;
	private String observacoes;
	
	
	public Agendamento() {
	}


	

	public Agendamento(Integer id, String nomeMedico, String especialidade, Integer dia, String horario,
			String nomePaciente, String telefone, String email, String observacoes) {
		super();
		this.id = id;
		this.nomeMedico = nomeMedico;
		this.especialidade = especialidade;
		this.dia = dia;
		this.horario = horario;
		this.nomePaciente = nomePaciente;
		this.telefone = telefone;
		this.email = email;
		this.observacoes = observacoes;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getNomeMedico() {
		return nomeMedico;
	}




	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}




	public String getEspecialidade() {
		return especialidade;
	}




	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}




	public Integer getDia() {
		return dia;
	}




	public void setDia(Integer dia) {
		this.dia = dia;
	}




	public String getHorario() {
		return horario;
	}




	public void setHorario(String horario) {
		this.horario = horario;
	}




	public String getNomePaciente() {
		return nomePaciente;
	}




	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getObservacoes() {
		return observacoes;
	}




	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		return "Agendamento [id=" + id + ", nomeMedico=" + nomeMedico + ", especialidade=" + especialidade + ", dia="
				+ dia + ", horario=" + horario + ", nomePaciente=" + nomePaciente + ", telefone=" + telefone
				+ ", email=" + email + ", observacoes=" + observacoes + "]";
	}



	
	
	
}

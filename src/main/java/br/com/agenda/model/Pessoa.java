package br.com.agenda.model;


import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="pessoa", schema="agenda")
public class Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private Long id;
	@Column(name="NOME", nullable=false, length=200)
	private String nome;
	@Column(name="CPF", nullable=false, length=11)
	private String cpf;
	@Column(name="SEXO", nullable=false, length=1)
	private String sexo;
	@Column(name="EMAIL", nullable=false, length=255)
	private String email;
	@Column(name="DATA_NASCIMENTO", nullable=false)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataNascimento;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return nome;
	}

	
}

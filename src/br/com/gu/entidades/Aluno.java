package br.com.gu.entidades;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private Long id;
	private String ra;
	private String nome;
	private String cpf;
	private String endereco;
	private List<Disciplina> disciplina = new ArrayList<>();

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

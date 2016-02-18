package br.com.gu.entidades;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private Long id;
	private String codigo;
	private String nome;
	private int cargaHoraria;
	private List<Aluno> aluno = new ArrayList<>();
	
	public Disciplina (String codigo, String nome) {
		this.codigo =codigo;
		this.nome=nome;
	}

	public long getId() {
		return id;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return nome;
	}

}

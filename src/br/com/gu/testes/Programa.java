package br.com.gu.testes;

import br.com.gu.entidades.Aluno;
import br.com.gu.entidades.Disciplina;

public class Programa {
	public static void main(String[] args) {
		Aluno gustavo = new Aluno();
		
		gustavo.setNome("Gustavo Enrique Cruz Andrade");
		gustavo.setCpf("99999999999");
		gustavo.setRa("000000000");
		
		Disciplina d1 = new Disciplina("Eng-235","Banco de dados");
		
		gustavo.getDisciplina().add(d1);
		
		System.out.println(gustavo.getDisciplina());
		System.out.println(gustavo.getNome());
		System.out.println(gustavo.getCpf());
		System.out.println(gustavo.getRa());
	}

}

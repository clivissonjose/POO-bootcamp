package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String [] args) {
		
		Curso  curso1 = new Curso();
		curso1.setTitulo("Poo com java");
		curso1.setDescricao("Aprendendo tudo de POO");
		curso1.setCargaHoraria(9);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Ajudando os outros com java");
		mentoria.setData(LocalDate.now());
		
	/*	System.out.println(curso1.toString());
		System.out.println(mentoria); */
		
		
		Bootcamp bootcamp =  new Bootcamp();
		bootcamp.setNome("Java");
		bootcamp.setDescricao("Descricao do curso de java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devClivisson = new Dev();
		devClivisson.setNome("Clivisson");
		devClivisson.inscreverBootcamp(bootcamp);
	}
	
}

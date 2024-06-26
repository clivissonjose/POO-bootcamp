package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo  {

	private LocalDate data;
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	protected double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 10;
	}
	
}

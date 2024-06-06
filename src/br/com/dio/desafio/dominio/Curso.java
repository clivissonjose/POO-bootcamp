package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", Descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	protected double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
}

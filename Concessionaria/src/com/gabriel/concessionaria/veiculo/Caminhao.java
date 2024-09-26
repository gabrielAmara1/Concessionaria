package com.gabriel.concessionaria.veiculo;

public final class Caminhao extends Veiculo {
	
	public Caminhao(String marca, int ano, double valor) {
		setMarca(marca);
		setAno(ano);
		setValor(valor);
	}
	
	public String verificarCarregamento() {
		return "Este Caminhao aguenta uma carga de 1000KG";
	}
	
}

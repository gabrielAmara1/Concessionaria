package com.gabriel.concessionaria.veiculo;

public final class Carro extends Veiculo {

	public Carro(String marca, int ano, double valor) {
		setMarca(marca);
		setAno(ano);
		setValor(valor);
	}
	
	public String tipoTracao() {
		return "Este Carro Tem Tração Traseira";
	}

}

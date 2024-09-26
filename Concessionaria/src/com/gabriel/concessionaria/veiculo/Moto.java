package com.gabriel.concessionaria.veiculo;

public final class Moto extends Veiculo {
	
	public Moto(String marca, int ano, double valor) {
		setMarca(marca);
		setAno(ano);
		setValor(valor);
	}
	
	public String empinar() {
		return "Empinando Moto";
	}
	
}

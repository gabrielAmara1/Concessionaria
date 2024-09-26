package com.gabriel.concessionaria.veiculo;

public sealed class Veiculo permits Carro, Moto, Caminhao {

	private String Marca;
	private int ano;
	private double valor;

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Veiculo [Marca=" + getMarca() + ", ano=" + getAno() + ", valor=" + getValor() + "]";
	}

}

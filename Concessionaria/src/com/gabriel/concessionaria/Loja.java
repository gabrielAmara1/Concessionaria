package com.gabriel.concessionaria;

import java.util.ArrayList;
import java.util.List;

import com.gabriel.concessionaria.veiculo.Caminhao;
import com.gabriel.concessionaria.veiculo.Carro;
import com.gabriel.concessionaria.veiculo.Moto;
import com.gabriel.concessionaria.veiculo.Veiculo;

public class Loja {

	public static void main(String[] args) {

		Carro carro = new Carro("Fiat", 2005, 12000.00);
		Moto Moto = new Moto("Yamaha", 2004, 4000.00);
		Caminhao caminhao = new Caminhao("Volkswagen", 2010, 30000.00);

		List<Veiculo> veiculos = new ArrayList<>();

		veiculos.add(carro);
		veiculos.add(Moto);
		veiculos.add(caminhao);

		for (Veiculo veiculo : veiculos) {

			if (veiculo instanceof Carro c && c != null)
				System.out.println(c.toString() + " " + c.tipoTracao());
			else if (veiculo instanceof Moto m && m != null)
				System.out.println(m.toString() + " " + m.empinar());
			else if (veiculo instanceof Caminhao c && c != null)
				System.out.println(c.toString() + " " + c.verificarCarregamento());

		}

	}

}

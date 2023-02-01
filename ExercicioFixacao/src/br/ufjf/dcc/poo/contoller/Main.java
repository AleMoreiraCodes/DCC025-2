package br.ufjf.dcc.poo.contoller;

import br.ufjf.dcc.poo.model.*;

public class Main {

	public static void main(String[] args) {
		Automovel automovel = new Automovel();
		automovel.setMarca("Mercedes");
		automovel.setKmPorLitro(15f);
		automovel.setCapacidadeTanque(40);
		System.out.println("Valor do consumo: " + automovel.calculaConsumo(5.1f));
	}

}

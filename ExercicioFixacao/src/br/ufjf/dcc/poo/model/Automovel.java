package br.ufjf.dcc.poo.model;

public class Automovel extends Veiculo{
	@Override
	public double calculaConsumo(double precoLitro) {
		return (this.getCapacidadeTanque()/this.getKmPorLitro()) * precoLitro;
	}
}//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

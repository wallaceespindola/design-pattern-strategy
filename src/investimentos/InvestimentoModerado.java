package investimentos;

import java.util.Random;

public class InvestimentoModerado implements Investimento {

	@Override
	public double calcular(OrcamentoInvestimento orcInvestimento) {

		double d = new Random().nextDouble();
		System.out.printf("\nValor random: %.2f \n", d);
		
		boolean escolhido = d > 0.50; // 50% de chance de true ou false

		if (escolhido) {
			System.out.println("Retornou 2.5%");
			return orcInvestimento.getValor() * 0.025; // 2.5%
			
		} else {
			System.out.println("Retornou 0.7%");
			return orcInvestimento.getValor() * 0.007; // 0.7%
		}
	}

}

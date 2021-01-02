package investimentos;

import java.util.Random;

public class InvestimentoArrojado implements Investimento {

	@Override
	public double calcular(OrcamentoInvestimento orcInvestimento) {
		
		double d = new Random().nextDouble();
		System.out.printf("\nValor random: %.2f \n", d);
		
		if (d <= 0.20) { // até 20%
			System.out.println("entre 0 e 0.20, 20% chance, retornou 5%");
			return orcInvestimento.getValor() * 0.05; // 5%
			
			
		} else if (d > 0.20 && d < 0.30) { // 30%
				System.out.println("entre 0.20 e 0.50, 30% de chance, retornou 3%");
				return orcInvestimento.getValor() * 0.03; // 3%
				
		} else { // 50%
			System.out.println("maior que 0.50, 50% de chance, retornou 0.6%");
			return orcInvestimento.getValor() * 0.006; // 0.6%
		}
	}

}

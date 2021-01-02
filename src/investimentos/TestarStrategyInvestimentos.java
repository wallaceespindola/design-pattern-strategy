package investimentos;

public class TestarStrategyInvestimentos {

	public static void main(String[] args) {

		double valInvestimento = 1000.00;
		System.out.println("Orcamento de investimento: " + valInvestimento + "\n");
		
		OrcamentoInvestimento orcInvestimento = new OrcamentoInvestimento(valInvestimento);
		
		Investimento conservador = new InvestimentoConservador();
		Investimento moderado = new InvestimentoModerado();
		Investimento arrojado = new InvestimentoArrojado();
		
		RealizadorDeInvestimentos investidor = new RealizadorDeInvestimentos();
		
		investidor.calcular(orcInvestimento, conservador);
		investidor.calcular(orcInvestimento, moderado);
		investidor.calcular(orcInvestimento, arrojado);
		
	}
	
}

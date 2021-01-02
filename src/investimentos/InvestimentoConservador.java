package investimentos;

public class InvestimentoConservador implements Investimento {

	@Override
	public double calcular(OrcamentoInvestimento orcInvestimento) {
		System.out.println("Retornou 0.8%");
		return orcInvestimento.getValor() * 0.008; // 0.8%
	}

}

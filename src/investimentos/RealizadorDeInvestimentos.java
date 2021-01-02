package investimentos;

public class RealizadorDeInvestimentos {

	public void calcular(OrcamentoInvestimento orcInvestimento, Investimento investimento) {

		double resultado = investimento.calcular(orcInvestimento);

		System.out.println("Resultado - " + investimento.getClass().getSimpleName() + ": " + resultado);
		System.out.println("Imposto - " + investimento.getClass().getSimpleName() + ": " + resultado * 0.25);
		System.out.println("Lucro - " + investimento.getClass().getSimpleName() + ": " + resultado * 0.75);
	}

}

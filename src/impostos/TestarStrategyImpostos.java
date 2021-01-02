package impostos;

public class TestarStrategyImpostos {

	public static void main(String[] args) {

		double valOrcamento = 1000.00;
		System.out.println("Orcamento de: " + valOrcamento);
		
		Orcamento orcamento = new Orcamento(valOrcamento);
		
		Imposto icms = new Icms();
		Imposto iss = new Iss();
		Imposto iccc = new Iccc();
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.calcular(orcamento, icms);
		calculador.calcular(orcamento, iss);
		calculador.calcular(orcamento, iccc);

	}

}

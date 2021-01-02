package impostos;

public class Icms implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {

		double val = (orcamento.getValor() * 0.05) + 50; // 5% + 50
		//System.out.println("Valor do ICMS: " + val);
		
		return val;
	}

}

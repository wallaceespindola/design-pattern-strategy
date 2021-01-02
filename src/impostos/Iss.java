package impostos;

public class Iss implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		
		double val = orcamento.getValor() * 0.06; // 6%
		//System.out.println("Valor do ISS: " + val);
		
		return val;
	}

}

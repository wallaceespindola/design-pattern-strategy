package impostos;

public class Iccc implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {

		double val = orcamento.getValor();
		double valCalculado;
		
		if(val < 1000) {
			valCalculado = val * 0.05;
			
		} else if (val >= 1000 && val <= 3000) {
			valCalculado = val * 0.07;
			
		} else {
			valCalculado = (val * 0.08) + 30;
		}
		
		return valCalculado;
	}

}

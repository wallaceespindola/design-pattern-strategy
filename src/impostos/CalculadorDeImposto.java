package impostos;

public class CalculadorDeImposto {

	public void calcular(Orcamento orcamento, Imposto imposto) {
		
		double resultado = imposto.calcular(orcamento);
		
		System.out.println("Resultado - " + imposto.getClass().getName() + ": "+ resultado);
	}

}

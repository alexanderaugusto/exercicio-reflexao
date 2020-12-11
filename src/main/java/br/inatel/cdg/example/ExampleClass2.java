package br.inatel.cdg.example;

import br.inatel.cdg.annotations.NumberToSum;

//Você deverá criar a @NumberToSum como parte da solução
public class ExampleClass2 {

	@NumberToSum(number = 4)
	private int field4;
	
	@NumberToSum(number = 5)
	private int field5;
	
	@NumberToSum(number = 6)
	public void method2() {
		System.out.println("Example Method With Annotation");
	}
}
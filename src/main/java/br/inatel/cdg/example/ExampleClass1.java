package br.inatel.cdg.example;

import br.inatel.cdg.annotations.NumberToSum;

//Você deverá criar a @NumberToSum como parte da solução
public class ExampleClass1 {

	@NumberToSum(number = 1)
	private int field1;

	@NumberToSum(number = 2)
	private int field2;
	
	@NumberToSum(number = 3)
	private int field3;
	
	public void method1() {
		System.out.println("Example Class 1");
	}
}
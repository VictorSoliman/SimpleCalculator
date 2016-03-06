package com.SimpleCalculation.basic;

import com.SimpleCalculator.Interface.CountingInterface;

/**
 * @author vic Abstract class declaring the main variables and main operations 
 */
public abstract class AbstractBasicCaculations implements CountingInterface {
	protected int x;
	protected int y;
	protected int z;
	
	@Override
	public void operation(char operationSymbol) {
	
		switch (operationSymbol) {
		case '+':
			z = x + y;
			break;
		case '-':
			z = x - y;
			break;
		case '/':
			z = x / y;
			break;
		case '*':
			z = x * y;
			break;
		}
		System.out.println("this is the result for " + operationSymbol + " = " + z);
	}

}

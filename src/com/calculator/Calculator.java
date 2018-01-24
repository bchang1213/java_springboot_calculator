package com.calculator;

public class Calculator implements CalculatorInterface{

	private double operandOne;
	private double operandTwo;
	private double result;
	private String operation;
	
	public double getoperandOne() {
		return operandOne;
	}
	public void setoperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getoperandTwo() {
		return operandTwo;
	}
	public void setoperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	@Override
	public void performOperation() {
		if(operation == "+") {
			result = operandOne + operandTwo;
		}
		else if(operation == "-") {
			result = operandOne + operandTwo;
		}
		else if(operation == "*") {
			result = operandOne * operandTwo;
		}
		else if(operation == "/") {
			result = operandOne / operandTwo;
		}
		else {
			System.out.println("Operation not valid.");
			result = 0;
		}
	}
	
	@Override
	public double getResults() {
		return result;
	}
	
}

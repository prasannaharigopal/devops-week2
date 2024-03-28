package com.devops.calculator;

import com.devops.calculator.DTO.OperandsDTORequest;
import com.devops.calculator.controller.CalculatorController;
import com.devops.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {
	@Autowired
	private CalculatorService calculatorService;

	@Test
	void testAddition() {
		OperandsDTORequest operandsDTORequest=new OperandsDTORequest();
		operandsDTORequest.setA(2);
		operandsDTORequest.setB(4);
		assertEquals(6,calculatorService.additionOfNumbers(operandsDTORequest));
	}


	@Test
	void testSubtraction(){
		OperandsDTORequest operandsDTORequest=new OperandsDTORequest();
		operandsDTORequest.setA(2);
		operandsDTORequest.setB(4);
		assertEquals(2,calculatorService.subtractionOfNumbers(operandsDTORequest));
	}

	@Test
	void testSubtractionAGreaterThanB(){
		OperandsDTORequest operandsDTORequest=new OperandsDTORequest();
		operandsDTORequest.setA(10);
		operandsDTORequest.setB(4);
		assertEquals(6,calculatorService.subtractionOfNumbers(operandsDTORequest));
	}

	@Test
	void testMultiplication(){
		OperandsDTORequest operandsDTORequest=new OperandsDTORequest();
		operandsDTORequest.setA(10);
		operandsDTORequest.setB(20);
		assertEquals(200,calculatorService.multiplicationOfNumbers(operandsDTORequest));
	}

}

package com.visitor.demo.visitor.impl;

import com.visitor.demo.modal.CommisionPaidEmployee;
import com.visitor.demo.modal.FixedAndCommisonPaidEmployee;
import com.visitor.demo.modal.FixedPaidEmployee;
import com.visitor.demo.visitor.SalaryCalculator;

public class SalaryCalculatorImpl implements SalaryCalculator {

	public double calculateSalary(CommisionPaidEmployee commisionPaidEmployee) {
		return commisionPaidEmployee.getCommisionRate()*commisionPaidEmployee.getSalesVolume();
	}

	public double calculateSalary(FixedPaidEmployee fixedPaidEmployee) {
		return fixedPaidEmployee.getSalary();
	}

	public double calculateSalary(FixedAndCommisonPaidEmployee fixedAndCommisonPaidEmployee) {
		// TODO Auto-generated method stub
		return 0;
	}

}

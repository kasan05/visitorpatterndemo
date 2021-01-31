package com.visitor.demo.visitor;

import com.visitor.demo.modal.CommisionPaidEmployee;
import com.visitor.demo.modal.FixedAndCommisonPaidEmployee;
import com.visitor.demo.modal.FixedPaidEmployee;

public interface SalaryCalculator {

	public double calculateSalary(CommisionPaidEmployee commisionPaidEmployee);

	public double calculateSalary(FixedPaidEmployee fixedPaidEmployee);
	
	public double calculateSalary(FixedAndCommisonPaidEmployee fixedAndCommisonPaidEmployee);

}

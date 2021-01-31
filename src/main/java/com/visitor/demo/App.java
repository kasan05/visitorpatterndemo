package com.visitor.demo;

import java.util.ArrayList;
import java.util.List;

import com.visitor.demo.modal.CommisionPaidEmployee;
import com.visitor.demo.modal.Employee;
import com.visitor.demo.modal.FixedPaidEmployee;
import com.visitor.demo.visitor.Printer;
import com.visitor.demo.visitor.SalaryCalculator;
import com.visitor.demo.visitor.impl.PrintrerImpl;
import com.visitor.demo.visitor.impl.SalaryCalculatorImpl;

public class App {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new FixedPaidEmployee(2, "kasan", 6000));
		employees.add(new CommisionPaidEmployee(2, "Steve", 25.5, 500));

		System.out.println("Sum of ALl Employees' Salaries:" + findTotalSalary(employees));

	}

	public static double findTotalSalary(List<Employee> employees) {
		SalaryCalculator salaryCalculator = new SalaryCalculatorImpl();
		Printer printer = new PrintrerImpl();
		double totalSalary = 0;
		for (Employee e : employees) {
			e.accept(printer);
			totalSalary = totalSalary + e.accept(salaryCalculator);
		}
		return totalSalary;
	}
}

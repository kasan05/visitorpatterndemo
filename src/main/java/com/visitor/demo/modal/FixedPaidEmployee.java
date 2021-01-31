package com.visitor.demo.modal;

import com.visitor.demo.visitor.Printer;
import com.visitor.demo.visitor.SalaryCalculator;

public class FixedPaidEmployee extends Employee {

	private double salary;

	public FixedPaidEmployee(int id, String name, double slaray) {
		super();
		this.setId(id);
		this.setName(name);
		this.setSalary(slaray);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double accept(SalaryCalculator salaryCalculator) {
		return salaryCalculator.calculateSalary(this);
	}

	public void accept(Printer printer) {
		printer.printAttributes(this);
	}

	@Override
	public String toString() {
		return "{\"id\":" + this.getId() + ", \"name\":\"" + this.getName() + "\",\"salary\":" + this.getSalary() + "}";

	}

}

package com.visitor.demo.modal;

import com.visitor.demo.visitor.Printer;
import com.visitor.demo.visitor.SalaryCalculator;

public class FixedAndCommisonPaidEmployee extends Employee {

	private double commisionRate;
	private double salesVolume;
	private double salary;

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	public double getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(double salesVolume) {
		this.salesVolume = salesVolume;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double accept(SalaryCalculator salaryCalculator) {
		return salaryCalculator.calculateSalary(this);
	}

	@Override
	public void accept(Printer printer) {
		printer.printAttributes(this);

	}

	@Override
	public String toString() {
		return "{\"id\":" + this.getId() + ", \"name\":\"" + this.getName() + "\",\"commisionRate\":"
				+ this.getCommisionRate() + ",\"salesVolume\":" + this.getSalesVolume() + ",\"salary\":"
				+ this.getSalary() + "}";
	}

}

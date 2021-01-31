package com.visitor.demo.modal;

import com.visitor.demo.visitor.Printer;
import com.visitor.demo.visitor.SalaryCalculator;

public class CommisionPaidEmployee extends Employee {

	private double commisionRate;
	private int salesVolume;

	public CommisionPaidEmployee(int id, String name, double commisionRate, int salesVolume) {
		super();
		this.setId(id);
		this.setName(name);
		this.commisionRate = commisionRate;
		this.salesVolume = salesVolume;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	public int getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
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
		return "{\"id\":" + this.getId() + ", \"name\":\"" + this.getName() 
		+ "\",\"commisionRate\":" + this.getCommisionRate() + ",\"salesVolume\":" + this.getSalesVolume() +"}"; 
	}

}

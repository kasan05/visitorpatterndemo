package com.visitor.demo.modal;

import com.visitor.demo.visitor.Printer;
import com.visitor.demo.visitor.SalaryCalculator;

public abstract class Employee {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double accept(SalaryCalculator salaryCalculator);

	public abstract void accept(Printer printer);

}

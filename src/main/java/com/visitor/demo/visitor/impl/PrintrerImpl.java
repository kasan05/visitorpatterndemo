package com.visitor.demo.visitor.impl;

import com.visitor.demo.modal.CommisionPaidEmployee;
import com.visitor.demo.modal.FixedAndCommisonPaidEmployee;
import com.visitor.demo.modal.FixedPaidEmployee;
import com.visitor.demo.visitor.Printer;

public class PrintrerImpl implements Printer {

	public void printAttributes(FixedPaidEmployee fixedPaidEmployee) {
		System.out.println(fixedPaidEmployee.toString());
	}

	public void printAttributes(CommisionPaidEmployee commisionPaidEmployee) {
		System.out.println(commisionPaidEmployee.toString());

	}

	public void printAttributes(FixedAndCommisonPaidEmployee fixedAndCommisonPaidEmployee) {
		// TODO Auto-generated method stub

	}

}

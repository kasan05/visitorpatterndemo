package com.visitor.demo.visitor;

import com.visitor.demo.modal.CommisionPaidEmployee;
import com.visitor.demo.modal.FixedAndCommisonPaidEmployee;
import com.visitor.demo.modal.FixedPaidEmployee;

public interface Printer {

	public void printAttributes(FixedPaidEmployee fixedPaidEmployee);

	public void printAttributes(CommisionPaidEmployee commisionPaidEmployee);

	public void printAttributes(FixedAndCommisonPaidEmployee fixedAndCommisonPaidEmployee);

}

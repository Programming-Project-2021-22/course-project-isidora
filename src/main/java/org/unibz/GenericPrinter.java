package org.unibz;


public class GenericPrinter<T> {
	T printing;
	public GenericPrinter(T printing) {
	this.printing = printing;
	}
	public void print() {
		System.out.println(printing);
	}
}

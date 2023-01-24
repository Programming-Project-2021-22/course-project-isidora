package org.unibz;

/**
 * GenericPrinter created and implemented in class Program – ID and Turnover.
 * Covered topic: Generic classes
 * @author isidora.erakovic
 *
 * @param <T>
 */
public class GenericPrinter<T> {
	T printing;
	public GenericPrinter(T printing) {
	this.printing = printing;
	}
	public void print() {
		System.out.println(printing);
	}
}

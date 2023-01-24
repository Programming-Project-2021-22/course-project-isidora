package org.unibz;
/**
 * GenericClass created and implemented in class Program – Clients and Field.
 * Covered topics: Generic classes
 * @author isidora.erakovic
 *
 * @param <T>
 */

public class GenericClass <T> {
T x;
GenericClass(T x){
	this.x = x;
}
public T getValue() {
	return x;
}
}
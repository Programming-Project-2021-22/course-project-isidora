package org.unibz.exceptions;

/**
 * Custom exception class. 
 * Covered topic: custom exceptions.
 * 
 * @author isidora.erakovic
 *
 */
public class CustomException extends RuntimeException {

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String message, Throwable cause) {
		super(message, cause);

	}

	public CustomException(String message) {
		super(message);

	}

}

package br.com.jean.payrollapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -4896233565293847760L;

	public ObjectNotFoundException(String message) {
		super(message);
	}

}

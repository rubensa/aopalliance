
package org.aopalliance.intercept;

/**
 * Exception thrown an attempt is made to retrieve the current Invocation
 * through an InvocationContext implementation, but no invocation information
 * is available.
 * @author Rod Johnson
 */
public class InvocationNotAvailableException extends AspectException {
	
	public InvocationNotAvailableException(String context) {
		super("Invocation not available: " + context);
	}

}

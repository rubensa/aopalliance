
package org.aopalliance;

/**
 * All AOP Frameworks must provide an implementation of this method to 
 * return information about the current Invocation.
 * HAVEN'T DEFINED HOW THIS WILL BE OBTAINED	
 * @author Rod Johnson
 */
public interface InvocationContext {
	
	/**
	 * Return the current invocation
	 * @return Invocation the current Invocation object if available.
	 * Never returns null. 
	 * @throws InvocationNotAvailableException if the AOP framework is not
	 * configured to permit access to the current invocation. This may be
	 * disabled for performance reasons, for example. 
	 */
	Invocation currentInvocation() throws InvocationNotAvailableException;

}

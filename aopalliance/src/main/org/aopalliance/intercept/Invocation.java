
package org.aopalliance.intercept;

/**
 * This interface represents an invocation in the program.
 *
 * <p>An invocation is a joinpoint and can be intercepted by an
 * interceptor. */

public interface Invocation extends Joinpoint {
    /**
     * Invoke the next interceptor in the chain.
     *
     * @return the result of the call on the target (might be intercepted and changed by an interceptor).
     * @throws Throwable if the call throws an exception.
     */
    Object invokeNext() throws Throwable;

    /**
     * Gets the target of the call.
     * [RJ] May return null if there is no target object.
     *
     * @return the actual target object.
     */
    Object getInvokedObject();

	/**
	 * Return the AOP proxy through which this invocation passed
	 * RJ
	 * @return Object
	 */
	Object getProxy();

    /**
     * [RJ]
     * the addResource and getResource methods
     * @param key name of the resource
     * @param resource
     * @return the former value of the resource with this key,
     * or null if no resource was set
     */
    Object setResource(String key, Object resource);

    /**
     * [RJ]
     * Return the resource with the given key
     * @param key
     * @return Object
     */
    Object getResource(String key);

	/**
	 * [RJ]
	 * Creates a copy of this invocation. Use to hold on to an instance longer
	 * than the duration of a method invocation. The new instance is not
	 * invokable.
	 */
	Invocation cloneInstance();
	
	/**
	* Return the AttributeRegistry. Cannot return null (but
	* can return an empty attribute registry).
	* TODO or do we want getAttributes() on this!? not tied to method.
	* Would be easier to test.
	* @return AttributeRegistry
	*/
   AttributeRegistry getAttributeRegistry();
}

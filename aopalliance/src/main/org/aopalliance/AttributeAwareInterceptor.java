package org.aopalliance;

/**
 * Interface to be implemented by Interceptors that need to be
 * able to find attribute information for each invocation they intercept.
 * 
 * @author Rod Johnson
 */
public interface AttributeAwareInterceptor extends Interceptor {

	/**
	 * This method must be invoked on an AttributeAwareInterceptor by the AOP Framework
	 * before the Interceptor services requests.
	 * @param attributeRegistry
	 */
	void setAttributeRegistry(AttributeRegistry attributeRegistry);

}

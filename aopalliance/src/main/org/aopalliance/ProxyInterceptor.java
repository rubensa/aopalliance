 
package org.aopalliance;

/**
 * Interface to be implemented by interceptors that have
 * a proxy target.
 * @author Rod Johnson
 * @since 14-Mar-2003
 * @version $Revision$
 */
public interface ProxyInterceptor extends Interceptor {
	
	Object getTarget();

}

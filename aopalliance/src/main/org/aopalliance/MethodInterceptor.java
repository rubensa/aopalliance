package org.aopalliance;

/**
 * Intercepts calls on an interface on it's way to the target.
 * These are nested "on top" of the target.
 */
public interface MethodInterceptor extends Interceptor
{
    /**
     * Do the stuff you want to do before and after the invocation. Polite implementations would certainly like
     * to implement {@link Invocation#invokeNext()}.
     * @param invocation
     * @return the result of the call to {@link Invocation#invokeNext()}, might be intercepted by the interceptor.
     * @throws Throwable if the interceptors or the target-object throws an exception.
     */
    Object invoke(MethodInvocation invocation) throws Throwable;
}

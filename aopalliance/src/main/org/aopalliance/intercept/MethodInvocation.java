package org.aopalliance.intercept;

import java.lang.reflect.Method;

/**
 * Description of an invocation to a method, given to an interceptor upon method-call.
 */
public interface MethodInvocation extends Invocation
{
    /**
     * Invoke the next interceptor in the stack (or the target if you're last).
     *
     * @return the result of the call on the target (might be intercepted and changed by an interceptor).
     * @throws Throwable if the call throws an exception.
     */
    Object invokeNext() throws Throwable;

    /**
     * Gets the index of the current interceptor.
     *
     * @return the index of the current interceptor.
     */
    int getCurrentInterceptorIndex();

    /**
     * Gets the total number of interceptors in the chain.
     *
     * @return the total number of interceptors in the chain.
     */
    int getInterceptorCount();

    /**
     * Gets the interceptors at the specified index.
     *
     * @param index index to the interceptor to retrieve.
     * @return the interceptors at the specified index.
     */
    Interceptor getInterceptor(int index);

    /**
     * Gets the method being called.
     *
     * @return the method being called.
     */
    Method getMethod();

    /**
     * Gets the value of the argument at the specified index.
     *
     * @param index the index.
     * @return the value of the argument.
     */
    Object getArgument(int index);

    /**
     * Modifies the specified argument.
     *
     * @param index the index of the argument.
     * @param argument the new value of the argument.
     */
    void setArgument(int index, Object argument);

    /**
     * Gets the number of arguments in the call.
     *
     * @return the number arguments to the call.
     */
    int getArgumentCount();
}


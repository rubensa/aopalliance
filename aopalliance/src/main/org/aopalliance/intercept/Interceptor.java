
package org.aopalliance.intercept;

/**
 * This interface represents a generic interceptor.
 *
 * <p>A generic interceptor can intercept runtime events that occurs
 * within a base program. Those events are materialized by (reified
 * in) joinpoints. Runtime joinpoints can be invocations, field
 * access, exceptions... 
 *
 * @see Joinpoint */

public interface Interceptor {

   Object intercept(Joinpoint joinpoint) throws Throwable;

}

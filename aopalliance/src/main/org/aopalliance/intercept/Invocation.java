
package org.aopalliance.intercept;

/**
 * This interface represents an invocation in the program.
 *
 * <p>An invocation is a joinpoint and can be intercepted by an
 * interceptor.
 *
 * @author Rod Johnson */

public interface Invocation extends Joinpoint {

   /**
    * The addResource and getResource methods.
    *
    * @param key name of the resource
    * @param resource
    * @return the former value of the resource with this key,
    * or null if no resource was set
    */
   Object setResource(String key, Object resource);
   
   /**
    * Return the resource with the given key.
    *
    * @param key
    * @return Object
    */
   Object getResource(String key);
   
   /**
    * Creates a copy of this invocation.
    *
    * <p>Use to hold on to an instance longer than the duration of a
    * method invocation. The new instance is not invokable. */
   Invocation cloneInstance();
   
   /**
    * Returns the AttributeRegistry.
    *
    * <p>Cannot return null (but can return an empty attribute
    * registry).  TODO or do we want getAttributes() on this!? not
    * tied to method.  Would be easier to test.
    *
    * @return AttributeRegistry */
   AttributeRegistry getAttributeRegistry();
   
   /**
    * Gets the value of the argument at the specified index.
    *
    * @param index the index.
    * @return the value of the argument. */
   Object getArgument(int index);
   
   /**
    * Modifies the specified argument.
    *
    * @param index the index of the argument.
    * @param argument the new value of the argument. */
   void setArgument(int index, Object argument);
   
   /**
    * Gets the number of arguments in the call.
    *
    * @return the number arguments to the call. */
   int getArgumentCount();

   /**
    * Get the arguments as an array object.
    *
    * @return the argument of the invocation */
   Object[] getArguments();

}


package org.aopalliance;

import java.lang.reflect.AccessibleObject;

/**
 * @author Rod Johnson
 */
public interface Attribute {
	
	String getName();
	
	Object getValue();
	
	/**
	 * Class this attribute was declared against.
	 * Never returns null.
	 * @return Class
	 */
	Class declaredAgainstClass();
	
	/**
	 * Field, constructor or method this attribute is declared against.
	 * May be null if it was declared against a class.
	 * @return Method
	 */
	AccessibleObject declaredAgainstMethod();
	
}

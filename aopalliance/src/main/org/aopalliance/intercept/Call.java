package org.aopalliance.intercept;

import java.io.*;
import java.lang.reflect.Method;

public class Call implements Serializable {
    static final long serialVersionUID = -3336463259251779539L;

    protected Object target;
    protected Object[] args;
    private Class declaringClass;
    private Class[] parameterTypes;
    private String methodName;

    public Call(MethodInvocation invocation) {
        Method method = invocation.getMethod();

        methodName = method.getName();
        declaringClass = method.getDeclaringClass();
        parameterTypes = invocation.getMethod().getParameterTypes();

        target = invocation.getThis();

        int argumentCount = invocation.getArgumentCount();
        args = new Object[argumentCount];
        for (int i = 0; i < args.length; i++) {
            args[i] = invocation.getArgument(i);
        }
    }

    /**
     * TODO Finds the method for each call, implement Externalizable instead.
     * @return the method of the call
     */
    public Method getMethod() {
        try {
            return declaringClass.getMethod(methodName, parameterTypes);
        } catch (Exception e) {
            throw new IllegalStateException("did not find method " + methodName);
        }
    }

    public Class getDeclaringClass() {
        return declaringClass;
    }

    public Object[] getArgs() {
        return args;
    }

    public Object getTarget() {
        return target;
    }
}

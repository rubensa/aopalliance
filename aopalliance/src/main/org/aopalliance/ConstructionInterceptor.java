package org.aopalliance;

public interface ConstructionInterceptor extends Interceptor {
    Object construct(ConstructionInvocation invocation);
}

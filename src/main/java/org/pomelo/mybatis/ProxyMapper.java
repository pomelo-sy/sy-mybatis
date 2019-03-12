package org.pomelo.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyMapper implements InvocationHandler {

	private SySqlSession sySqlSession;

	public ProxyMapper(SySqlSession sySqlSession) {
		this.sySqlSession = sySqlSession;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		if(method.getDeclaringClass().getName().equals(ConfigResolver.UserMapper.namespace)) {
			
		}
		return method.invoke(args);
	}

}

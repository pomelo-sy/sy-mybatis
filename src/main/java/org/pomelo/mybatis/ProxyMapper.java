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
			String para = String.valueOf(args[0]);
			String statement = ConfigResolver.UserMapper.mapper.get(method.getName());
			return sySqlSession.getResult(statement, para);
		}
		return method.invoke(args);
	}

}

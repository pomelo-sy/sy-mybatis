package org.pomelo.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MapperProxyfor implements InvocationHandler {

	private SessionFactory sf;

	public MapperProxyfor(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		 
		String statement = ConfigResolver.configurationXml.config.get(method.getName());
		String para = String.valueOf(args[0]);
		return sf.execute(statement,para);
	}

}

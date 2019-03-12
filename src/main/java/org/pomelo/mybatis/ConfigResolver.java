package org.pomelo.mybatis;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ConfigResolver {

	public<T> T getMapper(Class<T> clazz, SySqlSession sySqlSession) {
		
		return (T)Proxy.newProxyInstance(clazz.getClassLoader(),  new Class<?>[] {clazz}, new ProxyMapper(sySqlSession));
	}

	
	public static class UserMapper{
		
		public static final String namespace = "org.pomelo.mybatis.mapper.UserMapper";
		
		public final static Map<String, String> mapper = new HashMap<String, String>();
		static {
			mapper.put("selectByPrimaryKey", "select * from user where id=%d");
		}
		
	}
	
	
}

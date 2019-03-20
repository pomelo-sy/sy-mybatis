package org.pomelo.mybatis;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ConfigResolver {

	
	@SuppressWarnings("unchecked")
	public<T> T getMapper(Class clazz, SessionFactory sf) {
		return (T)Proxy.newProxyInstance(clazz.getClassLoader(), new Class[] {clazz}, new MapperProxyfor(sf));
	}
	
	
	static class configurationXml {
		
		public static Map<String, String> config = new HashMap<String, String>();
		static {
			config.put("findUserByPrimaryKey" ,"select * from User where id = d%" );
		}
	}
}

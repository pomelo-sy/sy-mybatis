package org.pomelo.mybatis;

import org.pomelo.mybatis.mapper.UserMapper;

public class SessionFactory {

	
	
	
	private ConfigResolver configResolver;
	private Execute simepleExecute;

	public SessionFactory(ConfigResolver configResolver, Execute simepleExecute) {
		this.configResolver = configResolver;
		this.simepleExecute = simepleExecute;
	}

	public <T> T execute(String statement, String para) {
		
		
		return simepleExecute.query(statement, para);
	}

	public <T> T getMapper(Class<UserMapper> clazz) {
		
		return configResolver.getMapper(clazz, this);
	}

	
}

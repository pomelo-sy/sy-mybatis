package org.pomelo.mybatis;

public class SySqlSession {

	private ConfigResolver resolver;
	private Executor executor;
	

	public SySqlSession(ConfigResolver resolver, Executor executor) {
		this.setExecutor(executor);
		this.setResolver(resolver);
	}
	
	public <T> T getMapper(Class<T> clazz) {
		return resolver.getMapper(clazz, this);
	}
	
	public <T> T getResult(String statement, String para) {
		return executor.query(statement, para);
	}

	public ConfigResolver getResolver() {
		return resolver;
	}

	public void setResolver(ConfigResolver resolver) {
		this.resolver = resolver;
	}

	public Executor getExecutor() {
		return executor;
	}

	public void setExecutor(Executor executor) {
		this.executor = executor;
	}


}

package org.pomelo.mybatis;

public interface Executor {

	<T> T query(String statement, String para);
}

package org.pomelo.mybatis;

public interface Execute {

	<T>T query(String statement, String para);
}

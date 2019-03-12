package org.pomelo.mybatis.start;

import org.pomelo.mybatis.ConfigResolver;
import org.pomelo.mybatis.SySimpleExecutor;
import org.pomelo.mybatis.SySqlSession;

public class Bootstrap {

	
	public static void main(String [] args) {
		
		SySqlSession session = new SySqlSession(new ConfigResolver(), new SySimpleExecutor());
		
	}
}

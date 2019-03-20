package org.pomelo.mybatis;

import org.pomelo.mybatis.entity.User;

public class simepleExecute implements Execute{

	
	private static final String jdbc = "myslq:...."; 
	@Override
	public <T> T query(String statement, String para) {
		
		
		User user = new User();
		user.setId(2);
		user.setNum(3333);
		user.setUserName("sy");
		return (T)user;
	}

}

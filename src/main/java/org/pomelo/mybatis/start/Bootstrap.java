package org.pomelo.mybatis.start;

import org.pomelo.mybatis.ConfigResolver;
import org.pomelo.mybatis.SessionFactory;
import org.pomelo.mybatis.simepleExecute;
import org.pomelo.mybatis.entity.User;
import org.pomelo.mybatis.mapper.UserMapper;

public class Bootstrap {

	
	public static void main(String [] args) {
		
		
		SessionFactory sf = new SessionFactory(new ConfigResolver(), new simepleExecute());
		
		UserMapper map = sf.getMapper(UserMapper.class);
		
		User u = map.findUserByPrimaryKey(1);
		
		System.out.println(u.getUserName());
		
		
	}
}

package org.pomelo.mybatis.start;

import org.pomelo.mybatis.ConfigResolver;
import org.pomelo.mybatis.SySimpleExecutor;
import org.pomelo.mybatis.SySqlSession;
import org.pomelo.mybatis.entity.User;
import org.pomelo.mybatis.mapper.UserMapper;

public class Bootstrap {

	
	public static void main(String [] args) {
		
		SySqlSession sss = new SySqlSession(new ConfigResolver(), new SySimpleExecutor());
		UserMapper mapper = sss.getMapper(UserMapper.class);
		User user = mapper.selectByPrimaryKey(1);
		System.out.println(user.getUserName());
	}
}

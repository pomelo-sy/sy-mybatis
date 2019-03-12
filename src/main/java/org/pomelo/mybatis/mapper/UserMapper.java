package org.pomelo.mybatis.mapper;

import org.pomelo.mybatis.annotation.Selector;
import org.pomelo.mybatis.entity.User;

public interface UserMapper {
	
	@Selector(value = { "select * from user where id = %d" })
	public User selectByPrimaryKey(Integer id);
	
}

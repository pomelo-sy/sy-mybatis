package org.pomelo.mybatis.mapper;

import org.pomelo.mybatis.entity.User;

public interface UserMapper {

	User findUserByPrimaryKey(Integer id);
	
}

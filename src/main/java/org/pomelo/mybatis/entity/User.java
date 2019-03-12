package org.pomelo.mybatis.entity;

public class User {
	
	private String userName;
	
	private Integer id;
	
	private Integer num;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		
		return "User: userId:"+id+"  num="+num+"  userName="+userName;
	}
	
	

}

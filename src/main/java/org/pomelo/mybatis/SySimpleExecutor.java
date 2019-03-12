package org.pomelo.mybatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.pomelo.mybatis.entity.User;


public class SySimpleExecutor implements Executor{
	
	
	private static final String JDBC_URL  ="jdbc:mysql://192.168.1.121:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	   
	@Override
	public <T> T query(String statement, String para) {
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		User user = new User();
		String sql = String.format(statement, Integer.parseInt(para));	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(JDBC_URL,"root","root");
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				user.setId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setNum(rs.getInt(3));
			}
			
			return (T)user;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != con) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

}

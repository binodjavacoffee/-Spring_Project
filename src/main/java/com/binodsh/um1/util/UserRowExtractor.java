package com.binodsh.um1.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.binodsh.um1.model.User;

public class UserRowExtractor implements ResultSetExtractor< User>{

	@Override
	public User extractData(ResultSet rs) throws SQLException, DataAccessException {
	User user = new User();
	user.setId(rs.getInt("Id"));
	user.setUsername(rs.getString("user_name"));
	user.setPassword(rs.getString("password"));
	user.setEmail(rs.getString("email"));
	user.setAddress(rs.getString("address"));
	user.setComments(rs.getString("comments"));
	user.setHobbies(rs.getString("hobbies"));
	user.setDob(rs.getDate("dob"));
	user.setGender(rs.getString("gender"));
	user.setMobileNo(rs.getLong("mobile_no"));
	user.setNationality(rs.getString("nationality"));
	
			
		return user;
	}

}

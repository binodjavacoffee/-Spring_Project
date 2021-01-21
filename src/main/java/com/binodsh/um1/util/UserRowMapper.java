package com.binodsh.um1.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.binodsh.um1.model.User;

public class UserRowMapper implements RowMapper<User > {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new UserRowExtractor().extractData(rs);
	}

}

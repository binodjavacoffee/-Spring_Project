package com.binodsh.um1.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.binodsh.um1.model.User;
import com.binodsh.um1.util.UserRowMapper;

//(@Repository) if this doesn't written then we need to create beans in spring-servlet.xml

public class UserRepositoryImpl implements UserRepository {
	private static final String SAVE_SQL = "insert into user_tbl(user_name,password,hobbies,nationality,email,dob,mobile_no,gender,address,comments)values(?,?,?,?,?,?,?,?,?,?)";
	private static final String LIST_SQL = "select * from user_tbl";
	private static final String DELETE_SQL = "delete from user_tbl where id=?";
	private static final String GET_USER_BY_ID_SQL = "select * from user_tbl where id=?";
	private static final String UPDATE_SQL = "update user_tbl set user_name=?,password=?,hobbies=?,nationality=?,email=?,dob=?,mobile_no=?,gender=?,address=?,comments=? where id =?";
	
	
	@Autowired
	private DataSource dataSource;

	@Override
	public void saveUser(User user) {
		// (THIS IS TAKEN OUT OF THE CONTEXT)----JdbcTemplate template = new
		// JdbcTemplate(dataSource);
		getJdbcTemplate(dataSource).update(SAVE_SQL,
				new Object[] { user.getUsername(), user.getPassword(), user.getHobbies(), user.getNationality(),
						user.getEmail(), user.getDob(), user.getMobileNo(), user.getGender(), user.getAddress(),
						user.getComments() });
	}

	@Override
	public List<User> getAllUser() {
		// JdbcTemplate template = new JdbcTemplate(dataSource);
		// while list use we need to use Query
		return getJdbcTemplate(dataSource).query(LIST_SQL, new UserRowMapper());

	}

	// this is create because of same template we have to call
	// once create we can change in SAVE_SQL

	private JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);

	}

	@Override
	public void deleteUser(int id) {
		getJdbcTemplate(dataSource).update(DELETE_SQL, new Object[] {id});
		
	}

	@Override
	public User getUserById(int id) {
		List<User> userList=getJdbcTemplate(dataSource).query(GET_USER_BY_ID_SQL, new Object [] {id},new UserRowMapper());

		return userList.get(0);
	}

	@Override
	public void updateUser(User user) {
		getJdbcTemplate(dataSource).update(UPDATE_SQL,
				new Object[] { user.getUsername(), user.getPassword(), user.getHobbies(), user.getNationality(),
						user.getEmail(), user.getDob(), user.getMobileNo(), user.getGender(), user.getAddress(),
						user.getComments() ,user.getId()});
		
	}
}

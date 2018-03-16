package com.what21.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.what21.model.Users;

public class UserMapper implements RowMapper<Users> {

	@Override
	public Users mapRow(ResultSet rs, int row) throws SQLException {
		Users u=new Users();
		u.setId(rs.getInt("id"));
		u.setName(rs.getString("name"));
		u.setAge(rs.getInt("age"));
		u.setPhone(rs.getString("phone"));
		u.setEmail(rs.getString("email"));
		return u;
	}

}

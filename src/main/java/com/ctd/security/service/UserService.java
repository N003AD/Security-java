package com.ctd.security.service;

import java.util.List;

import com.ctd.security.dao.IUserDao;
import com.ctd.security.dao.UserDao;
import com.ctd.security.dto.UserDto;
import com.ctd.security.entity.UserEntity;
import com.ctd.security.mapper.UserMapper;

public class UserService implements IUserService {

	private IUserDao userDao = new UserDao();
	
	@Override
	public List<UserDto> getAll() {
	
		return UserMapper.listUserEntityToListUserDto(userDao.list(new UserEntity()));
	}

}

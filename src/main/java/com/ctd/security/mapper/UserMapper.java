package com.ctd.security.mapper;


import java.util.List;
import java.util.stream.Collectors;

import com.ctd.security.dto.UserDto;
import com.ctd.security.entity.UserEntity;

public class UserMapper {

	
	public static List<UserDto> listUserEntityToListUserDto(List<UserEntity> users) {
		
		return users.stream()
				.map(user -> toUserDto(user))
				.collect(Collectors.toList());
	}
	
	
	public static UserDto toUserDto(UserEntity user) {
		
		return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
	}
	

}
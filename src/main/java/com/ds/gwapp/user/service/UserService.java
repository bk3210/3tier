package com.ds.gwapp.user.service;

import java.util.List;

import com.ds.gwapp.user.domain.UserDTO;

public interface UserService {
	List<UserDTO> getList(UserDTO dto);
	void insert(UserDTO dto);

}

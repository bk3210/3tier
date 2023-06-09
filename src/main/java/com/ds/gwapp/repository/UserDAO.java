package com.ds.gwapp.repository;

import java.util.List;

import com.ds.gwapp.domain.UserDTO;

public interface UserDAO {
	List<UserDTO> getList(UserDTO dto);
	UserDTO getView(int userNo);
	void insert(UserDTO dto);
	void update(UserDTO dto);
	void delete(int userNo);
	UserDTO getMyId(UserDTO dto);
}

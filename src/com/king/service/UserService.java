package com.king.service;

import com.king.entity.User;

public interface UserService {
	public User findById(long id);
	public boolean save(User user);
	public boolean deleteById(long id);
	public boolean update(User user);
}

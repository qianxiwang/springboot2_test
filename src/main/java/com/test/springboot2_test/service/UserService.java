package com.test.springboot2_test.service;

import com.test.springboot2_test.domain.User;

public interface UserService {

	User findById(Integer id);

	void save(User user);

}

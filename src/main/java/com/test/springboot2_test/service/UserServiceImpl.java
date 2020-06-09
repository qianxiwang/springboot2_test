package com.test.springboot2_test.service;

import com.test.springboot2_test.domain.User;
import com.test.springboot2_test.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@CacheConfig(cacheNames = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	@Cacheable(value = "user", key = "#p0")
	public User findById(Integer id) {
		Optional<User> _User = userMapper.findById(id);
		return Optional.ofNullable(_User).get().orElse(null);
	}

	@Override
	public void save(User user) {
		userMapper.save(user);
	}

}

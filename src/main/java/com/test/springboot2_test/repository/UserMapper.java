package com.test.springboot2_test.repository;

import com.test.springboot2_test.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends JpaRepository<User, Integer> {

}

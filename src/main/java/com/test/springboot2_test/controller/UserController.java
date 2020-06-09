package com.test.springboot2_test.controller;

import com.test.springboot2_test.domain.AjaxResponse;
import com.test.springboot2_test.domain.User;
import com.test.springboot2_test.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@Api(description = "用户接口")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users/{id}")
	@ApiOperation(value = "获取用户", notes = "根据id查询一个用户")
	public AjaxResponse toHello(@PathVariable("id") Integer id) {
		System.out.println("只有第一次才会打印sql语句");
		User u = userService.findById(id);
		return AjaxResponse.success(u);
	}

	@PostMapping("/signup")
	@ApiOperation(value = "注册用户", notes = "增加一个用户")
	public AjaxResponse signUp(@RequestBody User user) {

		log.info("User:" + user);
		userService.save(user);

		return AjaxResponse.success();
	}
}

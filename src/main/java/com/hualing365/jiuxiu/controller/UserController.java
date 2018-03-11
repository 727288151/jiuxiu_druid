/**
 * 
 */
package com.hualing365.jiuxiu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hualing365.jiuxiu.entity.User;
import com.hualing365.jiuxiu.service.IUserService;

/**
 * 
 * @author im.harley.lee@qq.com
 * @since Mar 10, 2018 6:44:17 PM
 */
@RestController
public class UserController {
	
	@Autowired
	IUserService userService;

	@RequestMapping("/queryuser/{uid}")
	public User queryUserById(@PathVariable int uid){
		return userService.queryUserById(uid);
	}
}

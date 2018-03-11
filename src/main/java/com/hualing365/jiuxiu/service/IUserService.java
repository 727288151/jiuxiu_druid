package com.hualing365.jiuxiu.service;

import com.hualing365.jiuxiu.entity.User;

/**
 * 用户Service接口类
 * @author im.harley.lee@qq.com
 * @since Mar 10, 2018 6:32:29 PM
 */
public interface IUserService {
	
	/**
	 * 根据用户Id查询用户
	 * @param uid
	 * @return
	 */
	public User queryUserById(int uid);
	
	/**
	 * 新增用户
	 * @param user
	 */
	public void addUser(User user);
	
}

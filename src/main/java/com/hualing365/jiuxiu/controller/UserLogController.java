/**
 * 
 */
package com.hualing365.jiuxiu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hualing365.jiuxiu.entity.UserLog;
import com.hualing365.jiuxiu.service.IUserLogService;

/**
 * 用户日志Controller
 * @author im.harley.lee@qq.com
 * @since Mar 13, 2018 11:50:49 PM
 */
@RestController
public class UserLogController {
	
	@Autowired
	IUserLogService userLogService;

	@GetMapping("/querylog/{roomId}/{uid}/{count}")
	public List<UserLog> queryUserLog(@PathVariable int roomId, @PathVariable int uid, @PathVariable int count){
		return userLogService.queryUserLog(roomId, uid, count);
	}
}

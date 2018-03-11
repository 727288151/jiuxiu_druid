/**
 * 
 */
package com.hualing365.jiuxiu.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.hualing365.jiuxiu.entity.User;

/**
 * 
 * @author im.harley.lee@qq.com
 * @since Mar 10, 2018 6:34:19 PM
 */
@Mapper
@Repository
public interface UserMapper {

	@Select("select * from t_user where uid=#{uid}")
	@ResultType(User.class)
	public User queryUserById(int uid);
	
	@Insert("insert into t_user(uid, accountid, nickname, headimage, familybadge, datetime) values(#{uid}, #{accountId}, #{nickName}, #{headImage}, #{familyBadge}, #{dateTime})")
	public void addUser(User user);
}

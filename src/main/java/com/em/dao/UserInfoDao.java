package com.em.dao;

import java.util.List;

import com.em.pojo.UserInfo;

/**
 * 用户信息与数据库交互类
 * 
 * @author liuzhihu
 *
 */
public interface UserInfoDao {

	/**
	 * 用户登录
	 * 
	 * @param info
	 * @return
	 */
	public UserInfo login(UserInfo info);

	/**
	 * 获取用户列表
	 * 
	 * @param info
	 * @return
	 */
	public List<UserInfo> list(UserInfo info);

	/**
	 * 通过id获取用户
	 * 
	 * @param info
	 * @return
	 */
	public UserInfo getUserById(UserInfo info);

	/**
	 * 通过id删除用户
	 * 
	 * @param info
	 */
	public void deleteUserById(UserInfo info);

}

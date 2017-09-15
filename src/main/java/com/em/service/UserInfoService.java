package com.em.service;

import java.util.List;

import com.em.pojo.UserInfo;

/**
 * 用户信息业务类
 * 
 * @author liuzhihu
 *
 */
public interface UserInfoService {

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
	 * 根据Id 删除单条用户
	 * 
	 * @param info
	 */
	public void deleteUserById(UserInfo info);

}

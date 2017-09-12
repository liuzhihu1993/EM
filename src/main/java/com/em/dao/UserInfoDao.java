package com.em.dao;

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

}

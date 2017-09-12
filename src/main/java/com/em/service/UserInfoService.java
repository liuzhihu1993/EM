package com.em.service;

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

}

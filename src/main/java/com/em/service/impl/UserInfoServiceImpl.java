package com.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.em.dao.UserInfoDao;
import com.em.pojo.UserInfo;
import com.em.service.UserInfoService;
import com.em.utils.EMConstant;
import com.em.utils.MD5Signature;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	/**
	 * 用户登录
	 */
	public UserInfo login(UserInfo info) {
		String password = MD5Signature.sign(EMConstant.JIAMI, info.getUserPassword());
		info.setUserPassword(password);
		return userInfoDao.login(info);
	}

	/**
	 * 获取用户列表
	 */
	public List<UserInfo> list(UserInfo info) {

		return userInfoDao.list(info);
	}

	/***
	 * 通过用户id获取用户
	 */
	public UserInfo getUserById(UserInfo info) {

		return userInfoDao.getUserById(info);
	}

	/**
	 * 通过id 删除用户
	 */
	public void deleteUserById(UserInfo info) {
		userInfoDao.deleteUserById(info);
	}

}

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

}

package com.em.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.em.pojo.UserInfo;
import com.em.service.UserInfoService;
import com.em.utils.EMConstant;

/**
 * 用户管理
 * 
 * @author liuzhihu
 *
 */

@Controller
public class UserController {

	@Autowired
	private UserInfoService userInfoService;

	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

	/**
	 * 获取用户列表
	 * 
	 * @param info
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/user/list.do")
	public String list(UserInfo info, Model model) {

		try {
			logger.debug("get user list start ......");
			// 首先判断
			if (info == null) {
				info = new UserInfo();
			}

			info.setUserMark(EMConstant.ROLE_MARK_YES);

			List<UserInfo> userList = userInfoService.list(info);

			logger.debug("get user list from database [{}]", userList);
			{
				model.addAttribute("list", userList);

				logger.debug("get user list end ......");

			}

		} catch (Exception e) {

			logger.debug("get user list  occure  the exception is  [{}]", e.getMessage());

			return "user/user_list";
		}

		return "user/user_list";
	}

	/***
	 * 根据用户id获取用户
	 * 
	 * @return
	 */
	@RequestMapping("/user/showuser.do")
	public String showUserById(UserInfo user, Model model) {

		try {
			logger.debug("get user by id start [{}]", user.toString());

			UserInfo info = userInfoService.getUserById(user);

			logger.debug("get user list from database [{}]", info);
			{

				model.addAttribute("userinfo", info);

				logger.debug("get user by id end  ......");

			}

		} catch (Exception e) {

			logger.debug("get user by id  occure  the exception is  [{}]", e.getMessage());

			return "user/user_show";
		}
		return "user/user_show";
	}

	/**
	 * 通过用户Id删除用户 并不是真实删除，只是查询不到
	 * 
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("/user/deleteById.do")
	public String deleteById(UserInfo user, Model model) {

		try {
			logger.debug("delete user by id start [{}]", user.toString());

			// 先查询，管理员不能删除 管理员user_accout 限定为admin
			UserInfo info = userInfoService.getUserById(user);

			logger.debug("get user by id end [{}]", info.toString());
			{

				if (null != info && !info.getUserAccount().equals("admin")) {

					logger.debug("the user is not admin,delete start..... ");

					userInfoService.deleteUserById(user);

					logger.debug("delete user by id end。。。。。");
				}
			}

			// 重新查询用户
			list(null, model);

		} catch (Exception e) {
			logger.debug("delete user by id  occure  the exception is  [{}]", e.getMessage());

			return "user/user_list";
		}

		return "user/user_list";
	}

}

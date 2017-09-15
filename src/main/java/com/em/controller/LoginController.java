package com.em.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.em.pojo.UserInfo;
import com.em.service.AnthorityService;
import com.em.service.UserInfoService;

/**
 * 用户登录
 * 
 * @author liuzhihu
 *
 */
@Controller
public class LoginController {

	/**
	 * 用户信息业务
	 */
	@Autowired
	private UserInfoService userservice;

	@Autowired
	private AnthorityService anthorityService;

	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping("login.do")
	public String login(UserInfo user, HttpSession session, Model model) {

		try {

			logger.debug("start user login [{}]", user.toString());
			UserInfo userinfo = userservice.login(user);

			logger.debug("get the user from database [{}]", userinfo.toString());
			{
				// 存在用户 放入session中
				session.setAttribute("user", userinfo);

				@SuppressWarnings("rawtypes")
				List<Map> list = anthorityService.getMenuList(userinfo.getRoleId());

				logger.debug("get the user menulist is [{}]", list.toString());

				session.setAttribute("menulist", list);

				logger.debug("end user login [{}]", user.toString());
				return "main/index";
			}

		} catch (Exception e) {

			logger.debug("login occure  the exception is  [{}]", e.getMessage());

			return "redirect:login.jsp";
		}

	}
}
